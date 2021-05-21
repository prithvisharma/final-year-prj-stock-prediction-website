from flask import Flask,render_template,jsonify,request
import sys
import os
import glob
import re
import numpy as np
import tensorflow as tf
import pymysql
from tensorflow.keras.models import load_model
from flask_cors import CORS, cross_origin

app = Flask(__name__)
CORS(app)
MODEL_PATH = 'model_inception1.h5'
model = load_model(MODEL_PATH)

@app.route('/')
@app.route('/index',methods = ['POST'])
@cross_origin()
def home():
    encoding = 'utf-8'
    name = request.get_data()
    name = str(name, encoding)
    print(name)
    mydb = pymysql.connect(host = "localhost", port  = 3308 , user = "root", password = "", db = "stocksdata")
    try:
        with mydb.cursor() as cur:
            sql = "SELECT close FROM "+name
            cur.execute(sql)

            rows = cur.fetchall()

            for row in rows:
                print(row)

    finally:
        mydb.close()   
    rows = list(rows)
    from numpy import array
    import pandas as pd
    import numpy as np

    df1 = pd.DataFrame(rows)

    print(df1)
    
    from sklearn.preprocessing import MinMaxScaler
    scaler=MinMaxScaler(feature_range=(0,1))
    df1=scaler.fit_transform(np.array(df1).reshape(-1,1))
    print(df1)
    training_size=int(len(df1)*0.65)
    print(training_size)
    test_size=len(df1)-training_size
    print(test_size)
    train_data,test_data=df1[0:training_size,:],df1[training_size:len(df1),:1]
    x_input=test_data[(test_size-100):].reshape(1,-1)
    temp_input=list(x_input)
    temp_input=temp_input[0].tolist()

    lst_output=[]
    n_steps=100
    i=0
    while(i<30):
        if(len(temp_input)>100):
            x_input=np.array(temp_input[1:])
            print("{} day input {}".format(i,x_input))
            x_input=x_input.reshape(1,-1)
            x_input = x_input.reshape((1, n_steps, 1))
            yhat = model.predict(x_input, verbose=0)
            print("{} day output {}".format(i,yhat))
            temp_input.extend(yhat[0].tolist())
            temp_input=temp_input[1:]
            lst_output.extend(yhat.tolist())
            i=i+1
        else:
            x_input = x_input.reshape((1, n_steps,1))
            yhat = model.predict(x_input, verbose=0)
            print(yhat[0])
            temp_input.extend(yhat[0].tolist())
            print(len(temp_input))
            lst_output.extend(yhat.tolist())
            i=i+1
    #print(lst_output)
    lst_output1 = []
    for i in lst_output:
        for j in i:
            lst_output1.append(j)
    return jsonify(lst_output1)
    # return render_template('index.html',lst_output=lst_output)

if __name__ == '__main__':
    app.run(debug=False)