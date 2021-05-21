import requests
import time
import schedule
import os
import pymysql
import csv

from datetime import date
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

def extract():       
    stock = ''
    stockDirectory = "C:\\Users\\33\Downloads"
    finalDirectory = ""
    print("started 100")
    
    
    urlStockNames = 'https://www1.nseindia.com/live_market/dynaContent/live_watch/stock_watch/niftyStockWatch.json'
    
    headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:78.0) Gecko/20100101 Firefox/78.0', 
               'Accept-Language' : 'en-US,en;q=0.5',                                                             
               'Accept-Encoding' : 'gzip, deflate, br'}
    
    response = requests.get(urlStockNames, headers = headers)    
    response = response.json()
    stockList = ['ADANIPORTS', 'ASIANPAINT', 'AXISBANK', 'BAJAJ-AUTO', 'BAJAJFINSV', 'BAJFINANCE', 'BHARTIARTL', 
             'BPCL', 'BRITANNIA', 'CIPLA', 'COALINDIA', 'DIVISLAB', 'DRREDDY', 'EICHERMOT', 'GRASIM', 'HCLTECH', 
             'HDFC', 'HDFCBANK', 'HDFCLIFE', 'HEROMOTOCO', 'HINDALCO', 'HINDUNILVR', 'ICICIBANK', 'INDUSINDBK', 
             'INFY', 'IOC', 'ITC', 'JSWSTEEL', 'KOTAKBANK', 'LT', 'M&M', 'MARUTI', 'NESTLEIND', 'NTPC', 'ONGC', 
             'POWERGRID', 'RELIANCE', 'SBILIFE', 'SBIN', 'SHREECEM', 'SUNPHARMA', 'TATACONSUM', 'TATAMOTORS', 
             'TATASTEEL', 'TCS', 'TECHM', 'TITAN', 'ULTRACEMCO', 'UPL', 'WIPRO']
    
    for row in stockList:
        #extract data from web and saving as csv
        symbol = row +'.NS'
        stock = symbol
        print(stock)
                
        path = "C:\Program Files (x86)\chromedriver.exe"
        
        driver = webdriver.Chrome(path)
        driver.get("https://in.finance.yahoo.com/")
        time.sleep(5)
        try:
            search = WebDriverWait(driver, 60).until(
            EC.presence_of_element_located((By.NAME, "yfin-usr-qry"))
            )
            time.sleep(1)
            search.clear()
            time.sleep(1)
            search.send_keys(stock)
            time.sleep(1)
            search.send_keys(Keys.RETURN)
            
            HistButton = WebDriverWait(driver, 60).until(
                #EC.presence_of_element_located((By.ID, "quote-nav"))
                EC.presence_of_element_located((By.XPATH, '//*[@id="quote-nav"]'))
            )
            time.sleep(1)
            HistButton.find_element_by_xpath("//a[contains(.,'Historical data')]").click()
            
            time.sleep(1)
            
            dateButton = WebDriverWait(driver, 60).until(
                EC.presence_of_element_located((By.ID, "Col1-1-HistoricalDataTable-Proxy"))
            )
            time.sleep(1)
            dateButton.find_element_by_xpath('//div[@class="M(0) O(n):f D(ib) Bd(0) dateRangeBtn O(n):f"]').click()
            time.sleep(1)
            
            dateRangeButton = WebDriverWait(driver, 60).until(
                EC.presence_of_element_located((By.ID, "dropdown-menu"))
            )
            time.sleep(1)
            dateRangeButton.find_element_by_xpath("//*[@id='dropdown-menu']/div/ul[1]/li[3]/button").click()
            time.sleep(1)
            dateButton.find_element_by_xpath('//*[@id="Col1-1-HistoricalDataTable-Proxy"]/section/div[1]/div[1]/button').click()
            time.sleep(1)
            dateButton.find_element_by_xpath('//*[@id="Col1-1-HistoricalDataTable-Proxy"]/section/div[1]/div[2]/span[2]/a').click()
            
            time.sleep(5)

            
            #here
            
            #add downloaded csv file to existing database
            #check duplicate entries, if any remove them 

            
            mydb = pymysql.connect(host = "localhost", port  = 3308 , user = "root", password = "", db = "stocksdata")
            mycursor = mydb.cursor()
            

            
            stockTableName = row
            if stockTableName.find('-') != -1:
                stockTableName = stockTableName.replace('-','_')
            if stockTableName.find('&') != -1:
                stockTableName = stockTableName.replace('&','_')
            
            #dropTable = "DROP TABLE IF EXISTS "+ stockTableName +";"
            #mycursor.execute(dropTable)
            # try:
            #     createTable = "CREATE TABLE IF NOT EXISTS "+ stockTableName +"(date varchar(100) , open varchar(100) ,high varchar(100),low varchar(100),close varchar(100),adjclose varchar(50),volume varchar(50));"
            #     mycursor.execute(createTable)
            # except:
            #     print('already exists.')

            #print(stockTableName)
 
            symbol =  row + '.NS' + '.csv'
            symbolPath = r"C:\Users\33\Downloads" + "\\" + symbol
            #print(symbolPath)
            
            with open(symbolPath) as csv_file:
                csvfile = csv.reader(csv_file,delimiter=',')
                all_value = []
                i = 0
                for row in csvfile:
                    try:
                        if i > 0:
                            value = (row[0],row[1],row[2],row[3],row[4],row[5],row[6],stockTableName)
                            query = "insert into " + stockTableName + " (`date`,`open`,`high`,`low`,`close`,`adj_close`,`volume`,`s_name`) values (%s,%s,%s,%s,%s,%s,%s,%s)"
                            mycursor.execute(query,value)
                            all_value.append(value)
                    except:
                        print("data exists !")

                    finally:
                        i += 1
    
            mydb.commit()
                
            print("added")
            #delete the downloaded files
            finalDirectory = stockDirectory + "\\" + stock + ".csv"
            #print(finalDirectory)
            os.remove(finalDirectory)
            
        finally:
            driver.delete_all_cookies()
            driver.quit()
 
    
extract()

#scheduling extraction function
#schedule.every().day.at("08:00").do(extract)  
# schedule.every().day.at("20:00").do(extract)  
#schedule.every().second.do(extract)                      
# if date.today().day != 26:
#     print("its not first day of month")
# else:
#     schedule.run_pending()
#     time.sleep(1)
    