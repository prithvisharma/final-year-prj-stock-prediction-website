package com.stocks.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stocks.model.Adaniports;
import com.stocks.model.Asianpaint;
import com.stocks.model.Axisbank;
import com.stocks.model.Bajajauto;
import com.stocks.model.Bajajfinsv;
import com.stocks.model.Bajfinance;
import com.stocks.model.Bhartiartl;
import com.stocks.model.Bpcl;
import com.stocks.model.Britannia;
import com.stocks.model.Cipla;
import com.stocks.model.Coalindia;
import com.stocks.model.Divislab;
import com.stocks.model.Drreddy;
import com.stocks.model.Eichermot;
import com.stocks.model.Grasim;
import com.stocks.model.Hcltech;
import com.stocks.model.Hdfc;
import com.stocks.model.Hdfcbank;
import com.stocks.model.Hdfclife;
import com.stocks.model.Heromotoco;
import com.stocks.model.Hindalco;
import com.stocks.model.Hindunilvr;
import com.stocks.model.Icicibank;
import com.stocks.model.Indusindbk;
import com.stocks.model.Infy;
import com.stocks.model.Ioc;
import com.stocks.model.Itc;
import com.stocks.model.Jswsteel;
import com.stocks.model.Kotakbank;
import com.stocks.model.Lt;
import com.stocks.model.Maruti;
import com.stocks.model.Mm;
import com.stocks.model.Nestleind;
import com.stocks.model.Ntpc;
import com.stocks.model.Ongc;
import com.stocks.model.Powergrid;
import com.stocks.model.Reliance;
import com.stocks.model.Sbilife;
import com.stocks.model.Sbin;
import com.stocks.model.Shreecem;
import com.stocks.model.Stocks;
import com.stocks.model.Sunpharma;
import com.stocks.model.Tataconsum;
import com.stocks.model.Tatamotors;
import com.stocks.model.Tatasteel;
import com.stocks.model.Tcs;
import com.stocks.model.Techm;
import com.stocks.model.Titan;
import com.stocks.model.Ultracemco;
import com.stocks.model.Upl;
import com.stocks.model.User;
import com.stocks.model.Wipro;
import com.stocks.repo.AdaniportsRepository;
import com.stocks.repo.AsianpaintRepository;
import com.stocks.repo.AxisbankRepository;
import com.stocks.repo.BajajautoRepository;
import com.stocks.repo.BajajfinsvRepository;
import com.stocks.repo.BajfinanceRepository;
import com.stocks.repo.BhartiartlRepository;
import com.stocks.repo.BpclRepository;
import com.stocks.repo.BritanniaRepository;
import com.stocks.repo.CiplaRepository;
import com.stocks.repo.CoalindiaRepository;
import com.stocks.repo.DivislabRepository;
import com.stocks.repo.DrreddyRepository;
import com.stocks.repo.EichermotRepository;
import com.stocks.repo.GrasimRepository;
import com.stocks.repo.HcltechRepository;
import com.stocks.repo.HdfcRepository;
import com.stocks.repo.HdfcbankRepository;
import com.stocks.repo.HdfclifeRepository;
import com.stocks.repo.HeromotocoRepository;
import com.stocks.repo.HindalcoRepository;
import com.stocks.repo.HindunilvrRepository;
import com.stocks.repo.IcicibankRepository;
import com.stocks.repo.IndusindbkRepository;
import com.stocks.repo.InfyRepository;
import com.stocks.repo.IocRepository;
import com.stocks.repo.ItcRepository;
import com.stocks.repo.JswsteelRepository;
import com.stocks.repo.KotakbankRepository;
import com.stocks.repo.LtRepository;
import com.stocks.repo.MarutiRepository;
import com.stocks.repo.MmRepository;
import com.stocks.repo.NestleindRepository;
import com.stocks.repo.NtpcRepository;
import com.stocks.repo.OngcRepository;
import com.stocks.repo.PowergridRepository;
import com.stocks.repo.RelianceRepository;
import com.stocks.repo.SbilifeRepository;
import com.stocks.repo.SbinRepository;
import com.stocks.repo.ShreecemRepository;
import com.stocks.repo.SunpharmaRepository;
import com.stocks.repo.TataconsumRepository;
import com.stocks.repo.TatamotorsRepository;
import com.stocks.repo.TatasteelRepository;
import com.stocks.repo.TcsRepository;
import com.stocks.repo.TechmRepository;
import com.stocks.repo.TitanRepository;
import com.stocks.repo.UltracemcoRepository;
import com.stocks.repo.UplRepository;
import com.stocks.repo.UserRepository;
import com.stocks.repo.WiproRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MainController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AdaniportsRepository adaniportsRepository;
	
	@Autowired
	AsianpaintRepository asianpaintRepository;
	
	@Autowired
	AxisbankRepository axisbankRepository;
	
	@Autowired
	BajajautoRepository bajajautoRepository;
	
	@Autowired
	BajajfinsvRepository bajajfinsvRepository;
	
	@Autowired
	BajfinanceRepository bajfinanceRepository;
	
	@Autowired
	BhartiartlRepository bhartiartlRepository;
	
	@Autowired
	BpclRepository bpclRepository;
	
	@Autowired
	BritanniaRepository britanniaRepository;
	
	@Autowired
	CiplaRepository ciplaRepository;
	
	@Autowired
	CoalindiaRepository coalindiaRepository;
	
	@Autowired
	DivislabRepository divislabRepository;
	
	@Autowired
	DrreddyRepository drreddyRepository;
	
	@Autowired
	EichermotRepository eichermotRepository;
	
	@Autowired
	GrasimRepository grasimRepository;
	
	@Autowired
	HcltechRepository hcltechRepository;
	
	@Autowired
	HdfcbankRepository hdfcbankRepository;
	
	@Autowired
	HdfclifeRepository hdfclifeRepository;
	
	@Autowired
	HdfcRepository hdfcRepository;
	
	@Autowired
	HeromotocoRepository heromotocoRepository;
	
	@Autowired
	HindalcoRepository hindalcoRepository;
	
	@Autowired
	HindunilvrRepository hindunilvrRepository;
	
	@Autowired
	IcicibankRepository icicibankRepository;
	
	@Autowired
	IndusindbkRepository indusindbkRepository;
	
	@Autowired
	InfyRepository infyRepository;
	
	@Autowired
	IocRepository iocRepository;
	
	@Autowired
	ItcRepository itcRepository;
	
	@Autowired
	JswsteelRepository jswsteelRepository;
	
	@Autowired
	KotakbankRepository kotakbankRepository;
	
	@Autowired
	LtRepository ltRepository;
	
	@Autowired
	MarutiRepository marutiRepository;
	
	@Autowired
	MmRepository mmRepository;
	
	@Autowired
	NestleindRepository nestleindRepository;
	
	@Autowired
	NtpcRepository ntpcRepository;
	
	@Autowired
	OngcRepository ongcRepository;
	
	@Autowired
	PowergridRepository powergridRepository;
	
	@Autowired
	RelianceRepository relianceRepository;
	
	@Autowired
	SbilifeRepository sbilifeRepository;
	
	@Autowired
	SbinRepository sbinRepository;
	
	@Autowired
	ShreecemRepository shreecemRepository;
	
	@Autowired
	SunpharmaRepository sunpharmaRepository;
	
	@Autowired
	TataconsumRepository tataconsumRepository;
	
	@Autowired
	TatamotorsRepository tatamotorsRepository;
	
	@Autowired
	TatasteelRepository tatasteelRepository;
	
	@Autowired
	TcsRepository tcsRepository;
	
	@Autowired
	TechmRepository techmRepository;
	
	@Autowired
	TitanRepository titanRepository;
	
	@Autowired
	UltracemcoRepository ultracemcoRepository;
	
	@Autowired
	UplRepository uplRepository;
	
	@Autowired
	WiproRepository wiproRepository;
		
	
	@GetMapping("/getendstocks")
	public List <Stocks> fetchEndStocks(){
		List <Stocks> stocksList = new ArrayList<Stocks>();
		
		Stocks stock1 = new Stocks();
		Adaniports adaniports = new Adaniports();
		adaniports = adaniportsRepository.findFirstByOrderBySidDesc();
		stock1.setSid(adaniports.getSid());
		stock1.setDate(adaniports.getDate());
		stock1.setOpen(adaniports.getOpen());
		stock1.setHigh(adaniports.getHigh());
		stock1.setLow(adaniports.getLow());
		stock1.setClose(adaniports.getClose());
		stock1.setAdjClose(adaniports.getAdjClose());
		stock1.setVolume(adaniports.getVolume());
		stock1.setSName(adaniports.getSName());
		stocksList.add(stock1);
		
		Stocks stock2 = new Stocks();
		Asianpaint asianpaint = new Asianpaint();
		asianpaint = asianpaintRepository.findFirstByOrderBySidDesc();
		stock2.setSid(asianpaint.getSid());
		stock2.setDate(asianpaint.getDate());
		stock2.setOpen(asianpaint.getOpen());
		stock2.setHigh(asianpaint.getHigh());
		stock2.setLow(asianpaint.getLow());
		stock2.setClose(asianpaint.getClose());
		stock2.setAdjClose(asianpaint.getAdjClose());
		stock2.setVolume(asianpaint.getVolume());
		stock2.setSName(asianpaint.getSName());
		stocksList.add(stock2);
		
		Stocks stock3 = new Stocks();
		Axisbank axisbank = new Axisbank();
		axisbank = axisbankRepository.findFirstByOrderBySidDesc();
		stock3.setSid(axisbank.getSid());
		stock3.setDate(axisbank.getDate());
		stock3.setOpen(axisbank.getOpen());
		stock3.setHigh(axisbank.getHigh());
		stock3.setLow(axisbank.getLow());
		stock3.setClose(axisbank.getClose());
		stock3.setAdjClose(axisbank.getAdjClose());
		stock3.setVolume(axisbank.getVolume());
		stock3.setSName(axisbank.getSName());
		stocksList.add(stock3);
		
		Stocks stock4 = new Stocks();
		Bajajauto bajajauto = new Bajajauto();
		bajajauto = bajajautoRepository.findFirstByOrderBySidDesc();
		stock4.setSid(bajajauto.getSid());
		stock4.setDate(bajajauto.getDate());
		stock4.setOpen(bajajauto.getOpen());
		stock4.setHigh(bajajauto.getHigh());
		stock4.setLow(bajajauto.getLow());
		stock4.setClose(bajajauto.getClose());
		stock4.setAdjClose(bajajauto.getAdjClose());
		stock4.setVolume(bajajauto.getVolume());
		stock4.setSName(bajajauto.getSName());
		stocksList.add(stock4);
		
		Stocks stock5 = new Stocks();
		Bajajfinsv bajajfinsv = new Bajajfinsv();
		bajajfinsv = bajajfinsvRepository.findFirstByOrderBySidDesc();
		stock5.setSid(bajajfinsv.getSid());
		stock5.setDate(bajajfinsv.getDate());
		stock5.setOpen(bajajfinsv.getOpen());
		stock5.setHigh(bajajfinsv.getHigh());
		stock5.setLow(bajajfinsv.getLow());
		stock5.setClose(bajajfinsv.getClose());
		stock5.setAdjClose(bajajfinsv.getAdjClose());
		stock5.setVolume(bajajfinsv.getVolume());
		stock5.setSName(bajajfinsv.getSName());
		stocksList.add(stock5);
		
		Stocks stock6 = new Stocks();
		Bajfinance bajfinance = new Bajfinance();
		bajfinance = bajfinanceRepository.findFirstByOrderBySidDesc();
		stock6.setSid(bajfinance.getSid());
		stock6.setDate(bajfinance.getDate());
		stock6.setOpen(bajfinance.getOpen());
		stock6.setHigh(bajfinance.getHigh());
		stock6.setLow(bajfinance.getLow());
		stock6.setClose(bajfinance.getClose());
		stock6.setAdjClose(bajfinance.getAdjClose());
		stock6.setVolume(bajfinance.getVolume());
		stock6.setSName(bajfinance.getSName());
		stocksList.add(stock6);
		
		Stocks stock7 = new Stocks();
		Bhartiartl bhartiartl = new Bhartiartl();
		bhartiartl = bhartiartlRepository.findFirstByOrderBySidDesc();
		stock7.setSid(bhartiartl.getSid());
		stock7.setDate(bhartiartl.getDate());
		stock7.setOpen(bhartiartl.getOpen());
		stock7.setHigh(bhartiartl.getHigh());
		stock7.setLow(bhartiartl.getLow());
		stock7.setClose(bhartiartl.getClose());
		stock7.setAdjClose(bhartiartl.getAdjClose());
		stock7.setVolume(bhartiartl.getVolume());
		stock7.setSName(bhartiartl.getSName());
		stocksList.add(stock7);
		
		Stocks stock8 = new Stocks();
		Bpcl bpcl = new Bpcl();
		bpcl = bpclRepository.findFirstByOrderBySidDesc();
		stock8.setSid(bpcl.getSid());
		stock8.setDate(bpcl.getDate());
		stock8.setOpen(bpcl.getOpen());
		stock8.setHigh(bpcl.getHigh());
		stock8.setLow(bpcl.getLow());
		stock8.setClose(bpcl.getClose());
		stock8.setAdjClose(bpcl.getAdjClose());
		stock8.setVolume(bpcl.getVolume());
		stock8.setSName(bpcl.getSName());
		stocksList.add(stock8);
		
		Stocks stock9 = new Stocks();
		Britannia britannia = new Britannia();
		britannia = britanniaRepository.findFirstByOrderBySidDesc();
		stock9.setSid(britannia.getSid());
		stock9.setDate(britannia.getDate());
		stock9.setOpen(britannia.getOpen());
		stock9.setHigh(britannia.getHigh());
		stock9.setLow(britannia.getLow());
		stock9.setClose(britannia.getClose());
		stock9.setAdjClose(britannia.getAdjClose());
		stock9.setVolume(britannia.getVolume());
		stock9.setSName(britannia.getSName());
		stocksList.add(stock9);
		
		Stocks stock10 = new Stocks();
		Cipla cipla = new Cipla();
		cipla = ciplaRepository.findFirstByOrderBySidDesc();
		stock10.setSid(cipla.getSid());
		stock10.setDate(cipla.getDate());
		stock10.setOpen(cipla.getOpen());
		stock10.setHigh(cipla.getHigh());
		stock10.setLow(cipla.getLow());
		stock10.setClose(cipla.getClose());
		stock10.setAdjClose(cipla.getAdjClose());
		stock10.setVolume(cipla.getVolume());
		stock10.setSName(cipla.getSName());
		stocksList.add(stock10);
		
		Stocks s11 = new Stocks();
		Coalindia coalindia = new Coalindia();
		coalindia = coalindiaRepository.findFirstByOrderBySidDesc();
		s11.setSid(coalindia.getSid());
		s11.setDate(coalindia.getDate());
		s11.setOpen(coalindia.getOpen());
		s11.setHigh(coalindia.getHigh());
		s11.setLow(coalindia.getLow());
		s11.setClose(coalindia.getClose());
		s11.setAdjClose(coalindia.getAdjClose());
		s11.setVolume(coalindia.getVolume());
		s11.setSName(coalindia.getSName());
		stocksList.add(s11);
		
		Stocks s12 = new Stocks();
		Divislab divislab = new Divislab();
		divislab = divislabRepository.findFirstByOrderBySidDesc();
		s12.setSid(divislab.getSid());
		s12.setDate(divislab.getDate());
		s12.setOpen(divislab.getOpen());
		s12.setHigh(divislab.getHigh());
		s12.setLow(divislab.getLow());
		s12.setClose(divislab.getClose());
		s12.setAdjClose(divislab.getAdjClose());
		s12.setVolume(divislab.getVolume());
		s12.setSName(divislab.getSName());
		stocksList.add(s12);
		
		Stocks s13 = new Stocks();
		Drreddy drreddy = new Drreddy();
		drreddy = drreddyRepository.findFirstByOrderBySidDesc();
		s13.setSid(drreddy.getSid());
		s13.setDate(drreddy.getDate());
		s13.setOpen(drreddy.getOpen());
		s13.setHigh(drreddy.getHigh());
		s13.setLow(drreddy.getLow());
		s13.setClose(drreddy.getClose());
		s13.setAdjClose(drreddy.getAdjClose());
		s13.setVolume(drreddy.getVolume());
		s13.setSName(drreddy.getSName());
		stocksList.add(s13);
		
		Stocks s14 = new Stocks();
		Eichermot eichermot = new Eichermot();
		eichermot = eichermotRepository.findFirstByOrderBySidDesc();
		s14.setSid(eichermot.getSid());
		s14.setDate(eichermot.getDate());
		s14.setOpen(eichermot.getOpen());
		s14.setHigh(eichermot.getHigh());
		s14.setLow(eichermot.getLow());
		s14.setClose(eichermot.getClose());
		s14.setAdjClose(eichermot.getAdjClose());
		s14.setVolume(eichermot.getVolume());
		s14.setSName(eichermot.getSName());
		stocksList.add(s14);
		
		Stocks s15 = new Stocks();
		Grasim grasim = new Grasim();
		grasim = grasimRepository.findFirstByOrderBySidDesc();
		s15.setSid(grasim.getSid());
		s15.setDate(grasim.getDate());
		s15.setOpen(grasim.getOpen());
		s15.setHigh(grasim.getHigh());
		s15.setLow(grasim.getLow());
		s15.setClose(grasim.getClose());
		s15.setAdjClose(grasim.getAdjClose());
		s15.setVolume(grasim.getVolume());
		s15.setSName(grasim.getSName());
		stocksList.add(s15);
		
		Stocks s16 = new Stocks();
		Hcltech hcltech = new Hcltech();
		hcltech = hcltechRepository.findFirstByOrderBySidDesc();
		s16.setSid(hcltech.getSid());
		s16.setDate(hcltech.getDate());
		s16.setOpen(hcltech.getOpen());
		s16.setHigh(hcltech.getHigh());
		s16.setLow(hcltech.getLow());
		s16.setClose(hcltech.getClose());
		s16.setAdjClose(hcltech.getAdjClose());
		s16.setVolume(hcltech.getVolume());
		s16.setSName(hcltech.getSName());
		stocksList.add(s16);
		
		Stocks s17 = new Stocks();
		Hdfcbank hdfcbank = new Hdfcbank();
		hdfcbank = hdfcbankRepository.findFirstByOrderBySidDesc();
		s17.setSid(hdfcbank.getSid());
		s17.setDate(hdfcbank.getDate());
		s17.setOpen(hdfcbank.getOpen());
		s17.setHigh(hdfcbank.getHigh());
		s17.setLow(hdfcbank.getLow());
		s17.setClose(hdfcbank.getClose());
		s17.setAdjClose(hdfcbank.getAdjClose());
		s17.setVolume(hdfcbank.getVolume());
		s17.setSName(hdfcbank.getSName());
		stocksList.add(s17);
		
		Stocks s18 = new Stocks();
		Hdfclife hdfclife = new Hdfclife();
		hdfclife = hdfclifeRepository.findFirstByOrderBySidDesc();
		s18.setSid(hdfclife.getSid());
		s18.setDate(hdfclife.getDate());
		s18.setOpen(hdfclife.getOpen());
		s18.setHigh(hdfclife.getHigh());
		s18.setLow(hdfclife.getLow());
		s18.setClose(hdfclife.getClose());
		s18.setAdjClose(hdfclife.getAdjClose());
		s18.setVolume(hdfclife.getVolume());
		s18.setSName(hdfclife.getSName());
		stocksList.add(s18);
		
		Stocks s19 = new Stocks();
		Hdfc hdfc = new Hdfc();
		hdfc = hdfcRepository.findFirstByOrderBySidDesc();
		s19.setSid(hdfc.getSid());
		s19.setDate(hdfc.getDate());
		s19.setOpen(hdfc.getOpen());
		s19.setHigh(hdfc.getHigh());
		s19.setLow(hdfc.getLow());
		s19.setClose(hdfc.getClose());
		s19.setAdjClose(hdfc.getAdjClose());
		s19.setVolume(hdfc.getVolume());
		s19.setSName(hdfc.getSName());
		stocksList.add(s19);
		
		Stocks s20 = new Stocks();
		Heromotoco heromotoco = new Heromotoco();
		heromotoco = heromotocoRepository.findFirstByOrderBySidDesc();
		s20.setSid(heromotoco.getSid());
		s20.setDate(heromotoco.getDate());
		s20.setOpen(heromotoco.getOpen());
		s20.setHigh(heromotoco.getHigh());
		s20.setLow(heromotoco.getLow());
		s20.setClose(heromotoco.getClose());
		s20.setAdjClose(heromotoco.getAdjClose());
		s20.setVolume(heromotoco.getVolume());
		s20.setSName(heromotoco.getSName());
		stocksList.add(s20);
		
		Stocks s21 = new Stocks();
		Hindalco hindalco = new Hindalco();
		hindalco = hindalcoRepository.findFirstByOrderBySidDesc();
		s21.setSid(hindalco.getSid());
		s21.setDate(hindalco.getDate());
		s21.setOpen(hindalco.getOpen());
		s21.setHigh(hindalco.getHigh());
		s21.setLow(hindalco.getLow());
		s21.setClose(hindalco.getClose());
		s21.setAdjClose(hindalco.getAdjClose());
		s21.setVolume(hindalco.getVolume());
		s21.setSName(hindalco.getSName());
		stocksList.add(s21);
		
		Stocks s22 = new Stocks();
		Hindunilvr hindunilvr = new Hindunilvr();
		hindunilvr = hindunilvrRepository.findFirstByOrderBySidDesc();
		s22.setSid(hindunilvr.getSid());
		s22.setDate(hindunilvr.getDate());
		s22.setOpen(hindunilvr.getOpen());
		s22.setHigh(hindunilvr.getHigh());
		s22.setLow(hindunilvr.getLow());
		s22.setClose(hindunilvr.getClose());
		s22.setAdjClose(hindunilvr.getAdjClose());
		s22.setVolume(hindunilvr.getVolume());
		s22.setSName(hindunilvr.getSName());
		stocksList.add(s22);
		
		Stocks s24 = new Stocks();
		Icicibank icicibank = new Icicibank();
		icicibank = icicibankRepository.findFirstByOrderBySidDesc();
		s24.setSid(icicibank.getSid());
		s24.setDate(icicibank.getDate());
		s24.setOpen(icicibank.getOpen());
		s24.setHigh(icicibank.getHigh());
		s24.setLow(icicibank.getLow());
		s24.setClose(icicibank.getClose());
		s24.setAdjClose(icicibank.getAdjClose());
		s24.setVolume(icicibank.getVolume());
		s24.setSName(icicibank.getSName());
		stocksList.add(s24);
		
		Stocks s25 = new Stocks();
		Indusindbk indusindbk = new Indusindbk();
		indusindbk = indusindbkRepository.findFirstByOrderBySidDesc();
		s25.setSid(indusindbk.getSid());
		s25.setDate(indusindbk.getDate());
		s25.setOpen(indusindbk.getOpen());
		s25.setHigh(indusindbk.getHigh());
		s25.setLow(indusindbk.getLow());
		s25.setClose(indusindbk.getClose());
		s25.setAdjClose(indusindbk.getAdjClose());
		s25.setVolume(indusindbk.getVolume());
		s25.setSName(indusindbk.getSName());
		stocksList.add(s25);
		
		Stocks s26 = new Stocks();
		Infy infy = new Infy();
		infy = infyRepository.findFirstByOrderBySidDesc();
		s26.setSid(infy.getSid());
		s26.setDate(infy.getDate());
		s26.setOpen(infy.getOpen());
		s26.setHigh(infy.getHigh());
		s26.setLow(infy.getLow());
		s26.setClose(infy.getClose());
		s26.setAdjClose(infy.getAdjClose());
		s26.setVolume(infy.getVolume());
		s26.setSName(infy.getSName());
		stocksList.add(s26);
		
		Stocks s27 = new Stocks();
		Ioc ioc = new Ioc();
		ioc = iocRepository.findFirstByOrderBySidDesc();
		s27.setSid(ioc.getSid());
		s27.setDate(ioc.getDate());
		s27.setOpen(ioc.getOpen());
		s27.setHigh(ioc.getHigh());
		s27.setLow(ioc.getLow());
		s27.setClose(ioc.getClose());
		s27.setAdjClose(ioc.getAdjClose());
		s27.setVolume(ioc.getVolume());
		s27.setSName(ioc.getSName());
		stocksList.add(s27);
		
		Stocks s28 = new Stocks();
		Itc itc = new Itc();
		itc = itcRepository.findFirstByOrderBySidDesc();
		s28.setSid(itc.getSid());
		s28.setDate(itc.getDate());
		s28.setOpen(itc.getOpen());
		s28.setHigh(itc.getHigh());
		s28.setLow(itc.getLow());
		s28.setClose(itc.getClose());
		s28.setAdjClose(itc.getAdjClose());
		s28.setVolume(itc.getVolume());
		s28.setSName(itc.getSName());
		stocksList.add(s28);
		
		Stocks s29 = new Stocks();
		Jswsteel jswsteel = new Jswsteel();
		jswsteel = jswsteelRepository.findFirstByOrderBySidDesc();
		s29.setSid(jswsteel.getSid());
		s29.setDate(jswsteel.getDate());
		s29.setOpen(jswsteel.getOpen());
		s29.setHigh(jswsteel.getHigh());
		s29.setLow(jswsteel.getLow());
		s29.setClose(jswsteel.getClose());
		s29.setAdjClose(jswsteel.getAdjClose());
		s29.setVolume(jswsteel.getVolume());
		s29.setSName(jswsteel.getSName());
		stocksList.add(s29);
		
		Stocks s30 = new Stocks();
		Kotakbank kotakbank = new Kotakbank();
		kotakbank = kotakbankRepository.findFirstByOrderBySidDesc();
		s30.setSid(kotakbank.getSid());
		s30.setDate(kotakbank.getDate());
		s30.setOpen(kotakbank.getOpen());
		s30.setHigh(kotakbank.getHigh());
		s30.setLow(kotakbank.getLow());
		s30.setClose(kotakbank.getClose());
		s30.setAdjClose(kotakbank.getAdjClose());
		s30.setVolume(kotakbank.getVolume());
		s30.setSName(kotakbank.getSName());
		stocksList.add(s30);
		
		Stocks s31 = new Stocks();
		Lt lt = new Lt();
		lt = ltRepository.findFirstByOrderBySidDesc();
		s31.setSid(lt.getSid());
		s31.setDate(lt.getDate());
		s31.setOpen(lt.getOpen());
		s31.setHigh(lt.getHigh());
		s31.setLow(lt.getLow());
		s31.setClose(lt.getClose());
		s31.setAdjClose(lt.getAdjClose());
		s31.setVolume(lt.getVolume());
		s31.setSName(lt.getSName());
		stocksList.add(s31);
		
		Stocks s32 = new Stocks();
		Maruti maruti = new Maruti();
		maruti = marutiRepository.findFirstByOrderBySidDesc();
		s32.setSid(maruti.getSid());
		s32.setDate(maruti.getDate());
		s32.setOpen(maruti.getOpen());
		s32.setHigh(maruti.getHigh());
		s32.setLow(maruti.getLow());
		s32.setClose(maruti.getClose());
		s32.setAdjClose(maruti.getAdjClose());
		s32.setVolume(maruti.getVolume());
		s32.setSName(maruti.getSName());
		stocksList.add(s32);
		
		Stocks s33 = new Stocks();
		Mm mm = new Mm();
		mm = mmRepository.findFirstByOrderBySidDesc();
		s33.setSid(mm.getSid());
		s33.setDate(mm.getDate());
		s33.setOpen(mm.getOpen());
		s33.setHigh(mm.getHigh());
		s33.setLow(mm.getLow());
		s33.setClose(mm.getClose());
		s33.setAdjClose(mm.getAdjClose());
		s33.setVolume(mm.getVolume());
		s33.setSName(mm.getSName());
		stocksList.add(s33);
		
		Stocks s34 = new Stocks();
		Nestleind nestleind = new Nestleind();
		nestleind = nestleindRepository.findFirstByOrderBySidDesc();
		s34.setSid(nestleind.getSid());
		s34.setDate(nestleind.getDate());
		s34.setOpen(nestleind.getOpen());
		s34.setHigh(nestleind.getHigh());
		s34.setLow(nestleind.getLow());
		s34.setClose(nestleind.getClose());
		s34.setAdjClose(nestleind.getAdjClose());
		s34.setVolume(nestleind.getVolume());
		s34.setSName(nestleind.getSName());
		stocksList.add(s34);
		
		Stocks s35 = new Stocks();
		Ntpc ntpc = new Ntpc();
		ntpc = ntpcRepository.findFirstByOrderBySidDesc();
		s35.setSid(ntpc.getSid());
		s35.setDate(ntpc.getDate());
		s35.setOpen(ntpc.getOpen());
		s35.setHigh(ntpc.getHigh());
		s35.setLow(ntpc.getLow());
		s35.setClose(ntpc.getClose());
		s35.setAdjClose(ntpc.getAdjClose());
		s35.setVolume(ntpc.getVolume());
		s35.setSName(ntpc.getSName());
		stocksList.add(s35);
		
		Stocks s36 = new Stocks();
		Ongc ongc = new Ongc();
		ongc = ongcRepository.findFirstByOrderBySidDesc();
		s36.setSid(ongc.getSid());
		s36.setDate(ongc.getDate());
		s36.setOpen(ongc.getOpen());
		s36.setHigh(ongc.getHigh());
		s36.setLow(ongc.getLow());
		s36.setClose(ongc.getClose());
		s36.setAdjClose(ongc.getAdjClose());
		s36.setVolume(ongc.getVolume());
		s36.setSName(ongc.getSName());
		stocksList.add(s36);
		
		Stocks s37 = new Stocks();
		Powergrid powergrid = new Powergrid();
		powergrid = powergridRepository.findFirstByOrderBySidDesc();
		s37.setSid(powergrid.getSid());
		s37.setDate(powergrid.getDate());
		s37.setOpen(powergrid.getOpen());
		s37.setHigh(powergrid.getHigh());
		s37.setLow(powergrid.getLow());
		s37.setClose(powergrid.getClose());
		s37.setAdjClose(powergrid.getAdjClose());
		s37.setVolume(powergrid.getVolume());
		s37.setSName(powergrid.getSName());
		stocksList.add(s37);
		
		Stocks s38 = new Stocks();
		Reliance reliance = new Reliance();
		reliance = relianceRepository.findFirstByOrderBySidDesc();
		s38.setSid(reliance.getSid());
		s38.setDate(reliance.getDate());
		s38.setOpen(reliance.getOpen());
		s38.setHigh(reliance.getHigh());
		s38.setLow(reliance.getLow());
		s38.setClose(reliance.getClose());
		s38.setAdjClose(reliance.getAdjClose());
		s38.setVolume(reliance.getVolume());
		s38.setSName(reliance.getSName());
		stocksList.add(s38);
		
		Stocks s39 = new Stocks();
		Sbilife sbilife = new Sbilife();
		sbilife = sbilifeRepository.findFirstByOrderBySidDesc();
		s39.setSid(sbilife.getSid());
		s39.setDate(sbilife.getDate());
		s39.setOpen(sbilife.getOpen());
		s39.setHigh(sbilife.getHigh());
		s39.setLow(sbilife.getLow());
		s39.setClose(sbilife.getClose());
		s39.setAdjClose(sbilife.getAdjClose());
		s39.setVolume(sbilife.getVolume());
		s39.setSName(sbilife.getSName());
		stocksList.add(s39);
		
		Stocks s40 = new Stocks();
		Sbin sbin = new Sbin();
		sbin = sbinRepository.findFirstByOrderBySidDesc();
		s40.setSid(sbin.getSid());
		s40.setDate(sbin.getDate());
		s40.setOpen(sbin.getOpen());
		s40.setHigh(sbin.getHigh());
		s40.setLow(sbin.getLow());
		s40.setClose(sbin.getClose());
		s40.setAdjClose(sbin.getAdjClose());
		s40.setVolume(sbin.getVolume());
		s40.setSName(sbin.getSName());
		stocksList.add(s40);
		
		Stocks s41 = new Stocks();
		Shreecem shreecem = new Shreecem();
		shreecem = shreecemRepository.findFirstByOrderBySidDesc();
		s41.setSid(shreecem.getSid());
		s41.setDate(shreecem.getDate());
		s41.setOpen(shreecem.getOpen());
		s41.setHigh(shreecem.getHigh());
		s41.setLow(shreecem.getLow());
		s41.setClose(shreecem.getClose());
		s41.setAdjClose(shreecem.getAdjClose());
		s41.setVolume(shreecem.getVolume());
		s41.setSName(shreecem.getSName());
		stocksList.add(s41);
		
		Stocks s42 = new Stocks();
		Sunpharma sunpharma = new Sunpharma();
		sunpharma = sunpharmaRepository.findFirstByOrderBySidDesc();
		s42.setSid(sunpharma.getSid());
		s42.setDate(sunpharma.getDate());
		s42.setOpen(sunpharma.getOpen());
		s42.setHigh(sunpharma.getHigh());
		s42.setLow(sunpharma.getLow());
		s42.setClose(sunpharma.getClose());
		s42.setAdjClose(sunpharma.getAdjClose());
		s42.setVolume(sunpharma.getVolume());
		s42.setSName(sunpharma.getSName());
		stocksList.add(s42);
		
		Stocks s43 = new Stocks();
		Tataconsum tataconsum = new Tataconsum();
		tataconsum = tataconsumRepository.findFirstByOrderBySidDesc();
		s43.setSid(tataconsum.getSid());
		s43.setDate(tataconsum.getDate());
		s43.setOpen(tataconsum.getOpen());
		s43.setHigh(tataconsum.getHigh());
		s43.setLow(tataconsum.getLow());
		s43.setClose(tataconsum.getClose());
		s43.setAdjClose(tataconsum.getAdjClose());
		s43.setVolume(tataconsum.getVolume());
		s43.setSName(tataconsum.getSName());
		stocksList.add(s43);
		
		Stocks s44 = new Stocks();
		Tatamotors tatamotors = new Tatamotors();
		tatamotors = tatamotorsRepository.findFirstByOrderBySidDesc();
		s44.setSid(tatamotors.getSid());
		s44.setDate(tatamotors.getDate());
		s44.setOpen(tatamotors.getOpen());
		s44.setHigh(tatamotors.getHigh());
		s44.setLow(tatamotors.getLow());
		s44.setClose(tatamotors.getClose());
		s44.setAdjClose(tatamotors.getAdjClose());
		s44.setVolume(tatamotors.getVolume());
		s44.setSName(tatamotors.getSName());
		stocksList.add(s44);
		
		Stocks s45 = new Stocks();
		Tatasteel tatasteel = new Tatasteel();
		tatasteel = tatasteelRepository.findFirstByOrderBySidDesc();
		s45.setSid(tatasteel.getSid());
		s45.setDate(tatasteel.getDate());
		s45.setOpen(tatasteel.getOpen());
		s45.setHigh(tatasteel.getHigh());
		s45.setLow(tatasteel.getLow());
		s45.setClose(tatasteel.getClose());
		s45.setAdjClose(tatasteel.getAdjClose());
		s45.setVolume(tatasteel.getVolume());
		s45.setSName(tatasteel.getSName());
		stocksList.add(s45);
		
		Stocks s46 = new Stocks();
		Tcs tcs = new Tcs();
		tcs = tcsRepository.findFirstByOrderBySidDesc();
		s46.setSid(tcs.getSid());
		s46.setDate(tcs.getDate());
		s46.setOpen(tcs.getOpen());
		s46.setHigh(tcs.getHigh());
		s46.setLow(tcs.getLow());
		s46.setClose(tcs.getClose());
		s46.setAdjClose(tcs.getAdjClose());
		s46.setVolume(tcs.getVolume());
		s46.setSName(tcs.getSName());
		stocksList.add(s46);
		
		Stocks s47 = new Stocks();
		Techm techm = new Techm();
		techm = techmRepository.findFirstByOrderBySidDesc();
		s47.setSid(techm.getSid());
		s47.setDate(techm.getDate());
		s47.setOpen(techm.getOpen());
		s47.setHigh(techm.getHigh());
		s47.setLow(techm.getLow());
		s47.setClose(techm.getClose());
		s47.setAdjClose(techm.getAdjClose());
		s47.setVolume(techm.getVolume());
		s47.setSName(techm.getSName());
		stocksList.add(s47);
		
		Stocks s48 = new Stocks();
		Titan titan = new Titan();
		titan = titanRepository.findFirstByOrderBySidDesc();
		s48.setSid(titan.getSid());
		s48.setDate(titan.getDate());
		s48.setOpen(titan.getOpen());
		s48.setHigh(titan.getHigh());
		s48.setLow(titan.getLow());
		s48.setClose(titan.getClose());
		s48.setAdjClose(titan.getAdjClose());
		s48.setVolume(titan.getVolume());
		s48.setSName(titan.getSName());
		stocksList.add(s48);
		
		Stocks s49 = new Stocks();
		Ultracemco ultracemco = new Ultracemco();
		ultracemco = ultracemcoRepository.findFirstByOrderBySidDesc();
		s49.setSid(ultracemco.getSid());
		s49.setDate(ultracemco.getDate());
		s49.setOpen(ultracemco.getOpen());
		s49.setHigh(ultracemco.getHigh());
		s49.setLow(ultracemco.getLow());
		s49.setClose(ultracemco.getClose());
		s49.setAdjClose(ultracemco.getAdjClose());
		s49.setVolume(ultracemco.getVolume());
		s49.setSName(ultracemco.getSName());
		stocksList.add(s49);
		
		Stocks s50 = new Stocks();
		Upl upl = new Upl();
		upl = uplRepository.findFirstByOrderBySidDesc();
		s50.setSid(upl.getSid());
		s50.setDate(upl.getDate());
		s50.setOpen(upl.getOpen());
		s50.setHigh(upl.getHigh());
		s50.setLow(upl.getLow());
		s50.setClose(upl.getClose());
		s50.setAdjClose(upl.getAdjClose());
		s50.setVolume(upl.getVolume());
		s50.setSName(upl.getSName());
		stocksList.add(s50);
		
		Stocks s51 = new Stocks();
		Wipro wipro = new Wipro();
		wipro = wiproRepository.findFirstByOrderBySidDesc();
		s51.setSid(wipro.getSid());
		s51.setDate(wipro.getDate());
		s51.setOpen(wipro.getOpen());
		s51.setHigh(wipro.getHigh());
		s51.setLow(wipro.getLow());
		s51.setClose(wipro.getClose());
		s51.setAdjClose(wipro.getAdjClose());
		s51.setVolume(wipro.getVolume());
		s51.setSName(wipro.getSName());
		stocksList.add(s51);
		
		return stocksList;
	}
	
	@PostMapping("/save")
	public void saveNewUser(@RequestBody User apiuser) {
		User user = new User();
		user = userRepository.save(apiuser);
	}
	
	@PostMapping("/auth")	
	public boolean login(@RequestBody String[] idpass) {
		User user = new User();
		boolean bool = userRepository.existsByEmail(idpass[0]);
		//System.out.println(bool);
		if(bool) {
			user = userRepository.findByEmail(idpass[0]);
			boolean bool2 ;
			bool2= user.getPass().equals(idpass[1]);
			//System.out.println(bool2);
			if(bool2) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	@PostMapping("/stockhist")
	public List<Stocks> stockHist(@RequestBody String stockdet) {
		List<Stocks> stockhist = new ArrayList<Stocks>();
		
		if(stockdet.equals("ADANIPORTS")) {
			stockhist = (List<Stocks>) (List<?>) adaniportsRepository.findAll();
		}
		
		if(stockdet.equals("ASIANPAINT")) {
			stockhist = (List<Stocks>) (List<?>) asianpaintRepository.findAll();
		}
		
		if(stockdet.equals("AXISBANK")) {
			stockhist = (List<Stocks>) (List<?>) axisbankRepository.findAll();
		}
		
		if(stockdet.equals("BAJAJ-AUTO")) {
			stockhist = (List<Stocks>) (List<?>) bajajautoRepository.findAll();
		}
		
		if(stockdet.equals("BAJAJFINSV")) {
			stockhist = (List<Stocks>) (List<?>) bajajfinsvRepository.findAll();
		}
		
		if(stockdet.equals("BAJFINANCE")) {
			stockhist = (List<Stocks>) (List<?>) bajfinanceRepository.findAll();
		}
		
		if(stockdet.equals("BHARTIARTL")) {
			stockhist = (List<Stocks>) (List<?>) bhartiartlRepository.findAll();
		}
		
		if(stockdet.equals("BPCL")) {
			stockhist = (List<Stocks>) (List<?>) bpclRepository.findAll();
		}
		
		if(stockdet.equals("BRITANNIA")) {
			stockhist = (List<Stocks>) (List<?>) britanniaRepository.findAll();
		}
		
		if(stockdet.equals("CIPLA")) {
			stockhist = (List<Stocks>) (List<?>) ciplaRepository.findAll();
		}
		
		if(stockdet.equals("COALINDIA")) {
			stockhist = (List<Stocks>) (List<?>) coalindiaRepository.findAll();
		}
		
		if(stockdet.equals("DIVISLAB")) {
			stockhist = (List<Stocks>) (List<?>) divislabRepository.findAll();
		}
		
		if(stockdet.equals("DRREDDY")) {
			stockhist = (List<Stocks>) (List<?>) drreddyRepository.findAll();
		}
		
		if(stockdet.equals("EICHERMOT")) {
			stockhist = (List<Stocks>) (List<?>) eichermotRepository.findAll();
		}
		
		if(stockdet.equals("GRASIM")) {
			stockhist = (List<Stocks>) (List<?>) grasimRepository.findAll();
		}
		
		if(stockdet.equals("HCLTECH")) {
			stockhist = (List<Stocks>) (List<?>) hcltechRepository.findAll();
		}
		
		if(stockdet.equals("HDFC")) {
			stockhist = (List<Stocks>) (List<?>) hdfcRepository.findAll();
		}
		
		if(stockdet.equals("HDFCBANK")) {
			stockhist = (List<Stocks>) (List<?>) hdfcbankRepository.findAll();
		}
		
		if(stockdet.equals("HDFCLIFE")) {
			stockhist = (List<Stocks>) (List<?>) hdfclifeRepository.findAll();
		}
		
		if(stockdet.equals("HEROMOTOCO")) {
			stockhist = (List<Stocks>) (List<?>) hdfclifeRepository.findAll();
		}
		
		if(stockdet.equals("HINDALCO")) {
			stockhist = (List<Stocks>) (List<?>) hindalcoRepository.findAll();
		}
		
		if(stockdet.equals("HINDUNILVR")) {
			stockhist = (List<Stocks>) (List<?>) hindunilvrRepository.findAll();
		}
		
		if(stockdet.equals("ICICIBANK")) {
			stockhist = (List<Stocks>) (List<?>) icicibankRepository.findAll();
		}
		
		if(stockdet.equals("INDUSINDBK")) {
			stockhist = (List<Stocks>) (List<?>) indusindbkRepository.findAll();
		}
		
		if(stockdet.equals("INFY")) {
			stockhist = (List<Stocks>) (List<?>) infyRepository.findAll();
		}
		
		if(stockdet.equals("IOC")) {
			stockhist = (List<Stocks>) (List<?>) iocRepository.findAll();
		}
		
		if(stockdet.equals("ITC")) {
			stockhist = (List<Stocks>) (List<?>) itcRepository.findAll();
		}
		
		if(stockdet.equals("JSWSTEEL")) {
			stockhist = (List<Stocks>) (List<?>) jswsteelRepository.findAll();
		}
		
		if(stockdet.equals("KOTAKBANK")) {
			stockhist = (List<Stocks>) (List<?>) kotakbankRepository.findAll();
		}
		
		if(stockdet.equals("LT")) {
			stockhist = (List<Stocks>) (List<?>) ltRepository.findAll();
		}
		
		if(stockdet.equals("M&M")) {
			stockhist = (List<Stocks>) (List<?>) mmRepository.findAll();
		}
		
		if(stockdet.equals("MARUTI")) {
			stockhist = (List<Stocks>) (List<?>) marutiRepository.findAll();
		}
		
		if(stockdet.equals("NESTLEIND")) {
			stockhist = (List<Stocks>) (List<?>) nestleindRepository.findAll();
		}
		
		if(stockdet.equals("NTPC")) {
			stockhist = (List<Stocks>) (List<?>) ntpcRepository.findAll();
		}
		
		if(stockdet.equals("ONGC")) {
			stockhist = (List<Stocks>) (List<?>) ongcRepository.findAll();
		}
		
		if(stockdet.equals("POWERGRID")) {
			stockhist = (List<Stocks>) (List<?>) powergridRepository.findAll();
		}
		
		if(stockdet.equals("RELIANCE")) {
			stockhist = (List<Stocks>) (List<?>) relianceRepository.findAll();
		}
		
		if(stockdet.equals("SBILIFE")) {
			stockhist = (List<Stocks>) (List<?>) sbilifeRepository.findAll();
		}
		
		if(stockdet.equals("SBIN")) {
			stockhist = (List<Stocks>) (List<?>) sbinRepository.findAll();
		}
		
		if(stockdet.equals("SHREECEM")) {
			stockhist = (List<Stocks>) (List<?>) shreecemRepository.findAll();
		}
		
		if(stockdet.equals("SUNPHARMA")) {
			stockhist = (List<Stocks>) (List<?>) sunpharmaRepository.findAll();
		}
		
		if(stockdet.equals("TATACONSUM")) {
			stockhist = (List<Stocks>) (List<?>) tataconsumRepository.findAll();
		}
		
		if(stockdet.equals("TATAMOTORS")) {
			stockhist = (List<Stocks>) (List<?>) tatamotorsRepository.findAll();
		}
		
		if(stockdet.equals("TATASTEEL")) {
			stockhist = (List<Stocks>) (List<?>) tatasteelRepository.findAll();
		}
		
		if(stockdet.equals("TCS")) {
			stockhist = (List<Stocks>) (List<?>) tcsRepository.findAll();
		}
		
		if(stockdet.equals("TECHM")) {
			stockhist = (List<Stocks>) (List<?>) techmRepository.findAll();
		}
		
		if(stockdet.equals("TITAN")) {
			stockhist = (List<Stocks>) (List<?>) titanRepository.findAll();
		}
		
		if(stockdet.equals("ULTRACEMCO")) {
			stockhist = (List<Stocks>) (List<?>) ultracemcoRepository.findAll();
		}
		
		if(stockdet.equals("UPL")) {
			stockhist = (List<Stocks>) (List<?>) uplRepository.findAll();
		}
		
		if(stockdet.equals("WIPRO")) {
			stockhist = (List<Stocks>) (List<?>) wiproRepository.findAll();
		}
		
		return stockhist;
	}
	
	@PostMapping("/getusername")
	public String extFname(@RequestBody String email) {
		User user = new User();
		user = userRepository.findByEmail(email);
		String fname = user.getFname();
		return fname;
	}
	
	@PostMapping("/checkemail")
	public boolean existEmail(@RequestBody String email) {
		boolean bool;
		bool = userRepository.existsByEmail(email);
		return bool;
	}
	
	
	@GetMapping("/test")
	public List<Integer> test() {
		List <Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		return list;
	}
}
