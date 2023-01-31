package unt1;
import java.util.Scanner;
import java.lang.Math;
public class Drive {
	
	static {
		System.out.println("WELCOME !!");
		System.out.println("                                                                            ");
		System.out.println("This is a video game shop !!");
		System.out.println("                                                                            ");
		System.out.println("Enter Your Requirments Below");
		System.out.println("                                                                            ");
	}
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			
			
			
		//ActivisionFPS Games
			Game COD = new COD("Call Of Duty", "Windows/XBOX/PS",10.0, 2003);
			Game CODMW = new CODMW("Call Of Duty Modern Warfare", "Windows/XBOX/PS",12.0, 2009);
			Game CODBO = new CODBO("Call Of Duty BlackOps", "Windows/XBOX/PS",31.0, 2010);
			Game CODBO2 = new CODBO2("Call Of Duty BlackOps 2", "Windows/XBOX/PS",11.0, 2012);
			
		//ActivisionRacing Games
			Game NS = new Nascar("Nascar", "Windows/XBOX/PS", 10.0, 2017);
			Game BD = new BloodDrive("Blood Drive", "Windows/XBOX/PS", 21.0, 2010);
			
		//ActivisionSPC Games
			Game SKR = new Sekiro("Sekiro", "Windows/XBOX/PC", 34.0, 2019);
				
			
		
		//EA Games
			Game HL = new HalfLife("HalfLife Complete Series", "Windows/XBOX/PS", 54.0, 2004);
			Game BF = new BattleField("BattleField", "Windows/XBOX/PS", 8.0, 2016);
			Game CRY = new Crysis("Crysis Trilogy", "Windows/XBOX/PS", 34.0,2013);
			Game AX = new ApexLegends("Apex Legends", "Windows/XBOX/PS", 11.0, 2019);
			
			
			Game NFS = new NeedForSpeed("Need For Speed Series", "Windows/XBOX/PS", 21.0, 2022);
			Game GD = new Grid("Grid", "Windows/XBOX/PS", 23.0, 2008);
			Game DT = new Dirt("Dirt", "Windows/XBOX/PS", 33.0, 2019);
			Game BPS = new BurnoutParadise("Burnout Paradise","Windows/XBOX/PS" ,44.0, 2008);
			
			EASPC ME = new MassEffect("Mass Effect", "Windows/XBOX/PS", 45.0, 2021);

		//UbisoftSPC Games 
			Game FC = new FarCry("FarCry Complete Series", "PC/Windows/XBOX", 23.0, 2021);
			Game AC = new AssassinCreed("Assassin's Creed", "PC/Windows/XBOX", 54.0, 2007);
			Game WD = new WatchDogs("Watch Dogs", "PC/Windows/XBOX", 22.0, 2014);
			Game DSF = new DriverSF("Driver SanFrancisco", "PC/Windows/XBOX", 13.0, 2011);
			
		//UbisoftFPS Games
			Game RSS = new RainbowSixSeige("Rainbow Six Seige", "Windows/XBOX/PS", 12.0, 2015);
			Game GRF = new GhostReconFrontline("Ghost Recon Frontline", "Windows/XBOX/PS", 32.0, 2021);
			
			Game DR = new Driver("Driver", "Windows/XBOX/PS", 10.0, 1999);
			Game TC = new TheCrew("The Crew", "Windows/XBOX/PS", 3.0, 2018);
		 
			
			
			
		//SONY SPC Games
			Game GOW = new GodOfWar("God Of War","PS", 69.0,2019);
			Game LOU = new LastOfUs("Last Of Us","PS", 19.0, 2015);
			Game SM = new SpiderMan("SpiderMan","PS", 28.0, 2017);
			Game UC = new Uncharted("Uncharted","PS", 44.0, 2017);
			Game NMS = new NoMansSky("No Man's Sky", "Windows/XBOX/PS", 9.0, 2016);
			Game GOWT = new GodOfWarTrilogy("God Of War Trilogy", "PS", 65.0, 2013);
			
		//SONY Racing
			Game GT = new GranTurismo("Gran Turismo", "PS/XBOX/Windows", 31.0, 2021);
			Game CR = new CrashRacing("Crash Racing", "PS/XBOX/Windows", 22.0, 2019);
			
		//Sony Shooter
			Game DG = new DaysGone("Days Gone", "PS", 43.0, 2019);
			Game LOUR = new LastOfUsRemastered("Last Of Us Remastered", "Windows/XBOX/PS", 44.0, 2022);
			
			
			
			
	
			//PlatForm Selection
			System.out.print("Select Platform (PC/XBOX/PS) : ");
			String SelPlatform = sc.nextLine();
			
			//Condition to avoid TypeError
			while(!SelPlatform.toLowerCase().contains("pc") && !SelPlatform.toLowerCase().contains("xbox") && !SelPlatform.toLowerCase().contains("ps")) {
				System.out.print("Try Again : ");
				SelPlatform = sc.nextLine();
			}
			
			System.out.println("                                                                            ");
			
			//Genre Selection
			System.out.print("Genre : (Select Shooter/Single Player Campaign/Racing) : ");
			String SelGenre = sc.nextLine();
			
			//Condition to avoid TypeError
			while(!SelGenre.toLowerCase().equals("shooter") && !SelGenre.toLowerCase().equals("single player campaign") && !SelGenre.toLowerCase().equals("racing")) {
				System.out.print("Try Again : " );
				SelGenre = sc.nextLine();
			}
			
			System.out.println("                                                                            ");
			
			
			//Publisher Selection
			System.out.print("Select Publisher : (Activision/EA/Ubisoft/Sony) : ");
			String SelPub = sc.nextLine();
			
			
			//Condition to avoid TypeError
			while(!SelPub.toLowerCase().equals("activision") && !SelPub.toLowerCase().equals("ea") && !SelPub.toLowerCase().equals("ubisoft") && !SelPub.toLowerCase().equals("sony")){
				System.out.print("Try Again !!! : ");
				SelPub = sc.nextLine();
			}
			
			System.out.println("                                                                            ");
			
			//Game Selection
			if(SelPub.toLowerCase().contains("ubisoft") && SelGenre.toLowerCase().contains("shooter") && (SelPlatform.toLowerCase().contains("pc") || SelPlatform.toLowerCase().contains("ps") 
					|| SelPlatform.toLowerCase().contains("xbox"))) {
				System.out.println("Stock Chart");
				System.out.println("1) Name : "+ FC.Name + " | Year : " + FC.Year + " | Price : " + FC.Price + "$");
				System.out.println("2) Name : "+ RSS.Name + " | Year : " + RSS.Year + " | Price : " + RSS.Price + "$");
				System.out.println("3) Name : "+ GRF.Name + " | Year : " + GRF.Year + " | Price : " + GRF.Price + "$");
				
				
			}
				else if(SelPub.toLowerCase().contains("ubisoft") && SelGenre.toLowerCase().contains("single player campaign")) {
					System.out.println("Stock Chart");
				System.out.println("1) Name : "+ AC.Name +" | Year : " + AC.Year + " | Price : " + AC.Price + "$");
				System.out.println("2) Name : "+ FC.Name + " | Year : " + FC.Year + " | Price : " + FC.Price + "$");
				System.out.println("3) Name : "+ DSF.Name + " | Year : " + DSF.Year + " | Price : " + DSF.Price + "$");
				}
				else if(SelPub.toLowerCase().contains("ubisoft") && SelGenre.toLowerCase().contains("Open World")) {
					System.out.println("Stock Chart");
				System.out.println("1) Name : "+ WD.Name + " | Year : " + WD.Year + " | Price : " + WD.Price + "$");
				System.out.println("2) Name : "+ FC.Name + " | Year : " + FC.Year + " | Price : " + FC.Price + "$");
				System.out.println("3) Name : "+ DSF.Name + " | Year : " + DSF.Year + " | Price : " + DSF.Price + "$");
					}
				else if(SelPub.toLowerCase().contains("ubisoft") && SelGenre.toLowerCase().contains("racing")) {
					System.out.println("Stock Chart");
					System.out.println("1) Name : "+ DSF.Name + " | Year : " + DSF.Year + " | Price : " + DSF.Price + "$");
					System.out.println("1) Name : "+ TC.Name + " | Year : " + TC.Year + " | Price : " + TC.Price + "$");
					System.out.println("1) Name : "+ DR.Name + " | Year : " + DR.Year + " | Price : " + DR.Price + "$");
						}
			
				else if(SelPub.toLowerCase().contains("sony") && SelGenre.toLowerCase().contains("single player campaign") && SelPlatform.toLowerCase().contains("ps")) {
				System.out.println("Stock Chart");
				System.out.println("1) Name : "+ GOW.Name + " | Year : " + GOW.Year + " | Price : " + GOW.Price + "$");
				System.out.println("2) Name : "+ LOU.Name + " | Year : " + LOU.Year + " | Price : " + LOU.Price + "$");
				System.out.println("3) Name : "+ SM.Name + " | Year : " + SM.Year + " | Price : " + SM.Price + "$");
				System.out.println("4) Name : "+ UC.Name + " | Year : " + UC.Year + " | Price : " + UC.Price + "$");
				System.out.println("5) Name : "+ GOWT.Name + " | Year : " + GOWT.Year + " | Price : " + GOWT.Price + "$");
					}
			
				else if(SelPub.toLowerCase().contains("sony") && SelGenre.toLowerCase().contains("single player campaign") && SelPlatform.toLowerCase().contains("pc")) {
					System.out.println("Stock Chart");
					System.out.println("1) Name : "+ GOW.Name + " | Year : " + GOW.Year  + " | Price : " + GOW.Price + "$");
					System.out.println("2) Name : "+ SM.Name + " | Year : " + SM.Year + " | Price : " + SM.Price + "$");
					System.out.println("3) Name : "+ DG.Name + " | Year : " + DG.Year  + " | Price : " + DG.Price + "$") ;
				}
				else if(SelPub.toLowerCase().contains("sony") && SelGenre.toLowerCase().contains("racing")) {
					System.out.println("Stock Chart");
					System.out.println("1) Name : "+ GT.Name + " | Year : " + GT.Year   + " | Price : " + GT.Price + "$");
					System.out.println("2) Name : "+ CR.Name + " | Year : " + CR.Year   + " | Price : " + CR.Price + "$");
				}
				else if(SelPub.toLowerCase().contains("sony") && SelGenre.toLowerCase().contains("shooter") && SelPlatform.toLowerCase().contains("ps")) {
					System.out.println("Stock Chart");
					System.out.println("1) Name : "+ LOU.Name + " | Year : " + LOU.Year + " | Price : " + LOU.Price + "$");
					System.out.println("2) Name : "+ UC.Name + " | Year : " + UC.Year + " | Price : " + UC.Price + "$");
					System.out.println("3) Name : "+ DG.Name + " | Year : " + DG.Year + " | Price : " + DG.Price + "$");
					System.out.println("4) Name : "+ LOUR.Name + " | Year : " + LOUR.Year + " | Price : " + LOUR.Price + "$");
				}
				else if(SelPub.toLowerCase().contains("sony") && SelGenre.toLowerCase().contains("shooter")) {
					System.out.println("Stock Chart");
					System.out.println("1) Name : "+ LOUR.Name + " | Year : " + LOUR.Year + " | Price : " + LOUR.Price + "$");
					System.out.println("2) Name : "+ DG.Name + " | Year : " + DG.Year + " | Price : " + DG.Price + "$");
				}
				else if(SelPub.toLowerCase().contains("sony") && SelGenre.toLowerCase().contains("single player campaign") && SelPlatform.toLowerCase().contains("xbox")) {
					System.out.println("Stock Chart");
					System.out.println("1) Name : "+ SM.Name + " | Year : " + SM.Year + " | Price : " + SM.Price + "$");
					System.out.println("2) Name : "+ NMS.Name + " | Year : " + NMS.Year + " | Price : " + NMS.Price + "$");
					
					
				}
	
			
				else if(SelPub.toLowerCase().contains("activision") && SelGenre.toLowerCase().contains("shooter")) {
				System.out.println("Stock Chart");
				    System.out.println("1) Name : "+ COD.Name + " | Year : " + COD.Year + " | Price : " + COD.Price + "$");
				    System.out.println("2) Name : "+ CODMW.Name + " | Year : " + CODMW.Year + " | Price : " + CODMW.Price + "$");
				    System.out.println("3) Name : "+ CODBO.Name + " | Year : " + CODBO.Year + " | Price : " + CODBO.Price + "$");
				    System.out.println("4) Name : "+ CODBO2.Name + " | Year : " + CODBO2.Year + " | Price : " + CODBO2.Price + "$");
				    
				}
				else if(SelPub.toLowerCase().contains("activision") && SelGenre.toLowerCase().contains("racing")) {
					System.out.println("Stock Chart");
					System.out.println("1) Name : "+ NS.Name + " | Year : " + NS.Year + " | Price : " + NS.Price + "$");
					System.out.println("2) Name : "+ BD.Name + " | Year : " + BD.Year + " | Price : " + BD.Price + "$");
					
				}
				else if(SelPub.toLowerCase().contains("activision") && SelGenre.toLowerCase().contains("single player campaign")) {
					System.out.println("1) Name : "+ COD.Name + " | Year : " + COD.Year + " | Price : " + COD.Price + "$");
				    System.out.println("2) Name : "+ CODMW.Name + " | Year : " + CODMW.Year + " | Price : " + CODMW.Price + "$");
				    System.out.println("3) Name : "+ CODBO.Name + " | Year : " + CODBO.Year + " | Price : " + CODBO.Price + "$");
				    System.out.println("4) Name : "+ CODBO2.Name + " | Year : " + CODBO2.Year + " | Price : " + CODBO2.Price + "$");
				    System.out.println("5) Name : "+ SKR.Name + " | Year : " + SKR.Year + " | Price : " + SKR.Price + "$");
				    
				}
				
				else if(SelPub.toLowerCase().contains("ea") && SelGenre.toLowerCase().contains("shooter")) {
					System.out.println("Stock Chart");
					System.out.println("1) Name : "+ HL.Name + " | Year : " + HL.Year + " | Price : " + HL.Price + "$");
					System.out.println("2) Name : "+ BF.Name + " | Year : " + BF.Year + " | Price : " + BF.Price + "$");
				    System.out.println("3) Name : "+ CRY.Name + " | Year : " + CRY.Year + " | Price : " + CRY.Price + "$");
					System.out.println("4) Name : "+ AX.Name + " | Year : " + AX.Year + " | Price : " + AX.Price + "$");
					}
				else if(SelPub.toLowerCase().contains("ea") && SelGenre.toLowerCase().contains("racing")) {
					System.out.println("Stock Chart");
					System.out.println("1) Name : "+ NFS.Name + " | Year : " + NFS.Year + " | Price : " + NFS.Price + "$");
					System.out.println("2) Name : "+ BPS.Name + " | Year : " + BPS.Year + " | Price : " + BPS.Price + "$");
				    System.out.println("3) Name : "+ DT.Name + " | Year : " + DT.Year + " | Price : " + DT.Price + "$");
					System.out.println("4) Name : "+ GD.Name + " | Year : " + GD.Year + " | Price : " + GD.Price + "$");
				}
				else if(SelPub.toLowerCase().contains("ea") && SelGenre.toLowerCase().contains("single player campaign")) {
					System.out.println("Stock Chart");
					System.out.println("1) Name : "+ HL.Name + " | Year : " + HL.Year + " | Price : " + HL.Price + "$");
					System.out.println("2) Name : "+ BF.Name + " | Year : " + BF.Year + " | Price : " + BF.Price + "$");
				    System.out.println("3) Name : "+ CRY.Name + " | Year : " + CRY.Year + " | Price : " + CRY.Price + "$");
				    System.out.println("4) Name : "+ ME.Name + " | Year : " + ME.Year + " | Price : " + ME.Price + "$");
				    
				}
			
	
				
				
			
			
			//Buying Codes
				System.out.println("                                                                            ");
				
				System.out.print("Enter the Name of the game you would like to buy : ");
				String SelName = sc.nextLine();
			//Error Condition
				while(!SelName.toLowerCase().equals("call of duty") && !SelName.toLowerCase().equals("call of duty modern warfare")
						&& !SelName.toLowerCase().equals("call of duty blackops") && !SelName.toLowerCase().equals("call of duty blackops 2")
						&& !SelName.toLowerCase().equals("farcry complete series") && !SelName.toLowerCase().equals("battlefield") 
						&& !SelName.toLowerCase().equals("apex legends") && !SelName.toLowerCase().equals("crysis trilogy")
						&& !SelName.toLowerCase().equals("assassins creed") && !SelName.toLowerCase().equals("assassin's creed")
						&& !SelName.toLowerCase().equals("halflife complete series") && !SelName.toLowerCase().equals("watch dogs")
						&& !SelName.toLowerCase().equals("driver sanfrancisco") && !SelName.toLowerCase().equals("rainbow six seige")
						&& !SelName.toLowerCase().equals("god of war") && !SelName.toLowerCase().equals("last of us")
						&& !SelName.toLowerCase().equals("spiderman") && !SelName.toLowerCase().equals("uncharted")
						&& !SelName.toLowerCase().equals("need for speed series") && !SelName.toLowerCase().equals("dirt")
						&& !SelName.toLowerCase().equals("grid") && !SelName.toLowerCase().equals("burnout paradise")
						&& !SelName.toLowerCase().equals("nascar") && !SelName.toLowerCase().equals("blood drive")
						&& !SelName.toLowerCase().equals("blood drive") && !SelName.toLowerCase().equals("ghost recon frontline")
						&& !SelName.toLowerCase().equals("gran turismo") && !SelName.toLowerCase().equals("crash racing")
						&& !SelName.toLowerCase().equals("the crew") && !SelName.toLowerCase().equals("days gone")
						&& !SelName.toLowerCase().equals("last of us remastered") && !SelName.toLowerCase().equals("god of war trilogy")
						&& !SelName.toLowerCase().equals("mass effect") && !SelName.toLowerCase().equals("no man's sky")
						&& !SelName.toLowerCase().equals("god of war trilogy") && !SelName.toLowerCase().equals("sekiro")
						&& !SelName.toLowerCase().equals("driver")){
					System.out.println("There has been a mistake");
					System.out.print("Try Again : ");
					SelName = sc.nextLine();
				}
				
				
				
				//Call Of Duty		
				if(SelName.toLowerCase().equals("call of duty") ){
					System.out.println("                                                                            ");
					System.out.println(COD.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + COD.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + COD.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + COD.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				
				//Call Of Duty Modern Warfare
				else if(SelName.toLowerCase().equals("call of duty modern warfare")) {
					System.out.println("                                                                            ");
					System.out.println(CODMW.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + CODMW.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + CODMW.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + CODMW.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				
				//Call Of Duty Black Ops
				
				else if(SelName.toLowerCase().equals("call of duty blackops"))  {
					System.out.println("                                                                            ");
					System.out.println(CODBO.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + CODBO.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + CODBO.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + CODBO.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Call Of Duty Black Ops2
				else if(SelName.toLowerCase().equals("call of duty blackops 2")) {
					System.out.println("                                                                            ");
					System.out.println(CODBO2.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + CODBO2.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + CODBO2.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + CODBO2.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Far Cry
				else if((SelName.toLowerCase().equals("farcry complete series"))) {
					System.out.println(FC.Price);
					System.out.println("How would you like to Buy ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + FC.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + FC.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + FC.Price + "$ by CreditCard");
					}
					System.out.println(" ======================================================================= ");
					game();
				}
				//BattleField
				else if((SelName.toLowerCase().equals("battlefield")))  {
					System.out.println("                                                                            ");
					System.out.println(BF.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + BF.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + BF.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + BF.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Crysis
				else if(SelName.toLowerCase().equals("crysis trilogy"))  {
					System.out.println("                                                                            ");
					System.out.println(CRY.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + CRY.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + CRY.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + CRY.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//ApexLegends
				else if(SelName.toLowerCase().equals("apex legends")){
					System.out.println("                                                                            ");
					System.out.println(AX.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + AX.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + AX.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + AX.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Assassins Creed
				else if(SelName.toLowerCase().equals("assassins creed") || SelName.toLowerCase().equals("assassin's creed")){
					System.out.println("                                                                            ");
					System.out.println(AC.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + AC.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + AC.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + AC.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Half Life Complete Series
				else if(SelName.toLowerCase().equals("halflife complete series")){
					System.out.println("                                                                            ");
					System.out.println(HL.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + HL.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + HL.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + HL.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//WatchDogs
				else if(SelName.toLowerCase().equals("watch dogs")){
					System.out.println("                                                                            ");
					System.out.println(WD.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + WD.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + WD.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + WD.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//DriverSF
				else if(SelName.toLowerCase().equals("driver sanfrancisco")){
					System.out.println("                                                                            ");
					System.out.println(DSF.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + DSF.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + DSF.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + DSF.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Rainbow Six Seige
				else if(SelName.toLowerCase().equals("rainbow six seige")){
					System.out.println("                                                                            ");
					System.out.println(RSS.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + RSS.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + RSS.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + RSS.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//God Of War
				else if(SelName.toLowerCase().equals("god of war")){
					System.out.println("                                                                            ");
					System.out.println(GOW.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + GOW.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + GOW.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + GOW.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Last Of Us
				else if(SelName.toLowerCase().equals("last of us")){
					System.out.println("                                                                            ");
					System.out.println(LOU.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + LOU.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + LOU.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + LOU.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//SpiderMan
				else if(SelName.toLowerCase().equals("spiderman")){
					System.out.println("                                                                            ");
					System.out.println(SM.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + SM.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + SM.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + SM.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Uncharted
				else if(SelName.toLowerCase().equals("uncharted")){
					System.out.println("                                                                            ");
					System.out.println(UC.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + UC.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + UC.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + UC.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Need For Speed
				else if(SelName.toLowerCase().equals("need for speed series")){
					System.out.println("                                                                            ");
					System.out.println(NFS.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + NFS.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + NFS.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + NFS.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Dirt
				else if(SelName.toLowerCase().equals("dirt")){
					System.out.println("                                                                            ");
					System.out.println(DT.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + DT.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + DT.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + DT.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Grid
				else if(SelName.toLowerCase().equals("grid")){
					System.out.println("                                                                            ");
					System.out.println(GD.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + GD.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + GD.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + GD.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Burnout Paradise
				else if(SelName.toLowerCase().equals("burnout paradise")){
					System.out.println("                                                                            ");
					System.out.println(BPS.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + BPS.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + BPS.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + BPS.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//NASCAR
				else if(SelName.toLowerCase().equals("nascar")){
					System.out.println("                                                                            ");
					System.out.println(NS.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + NS.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + NS.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + NS.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Blood drive
				else if(SelName.toLowerCase().equals("blood drive")){
					System.out.println("                                                                            ");
					System.out.println(BD.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + BD.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + BD.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + BD.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Ghost Recon Frontline
				else if(SelName.toLowerCase().equals("ghost recon frontline")){
					System.out.println("                                                                            ");
					System.out.println(GRF.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + GRF.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + GRF.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + GRF.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Gran Turismo
				else if(SelName.toLowerCase().equals("gran turismo")){
					System.out.println("                                                                            ");
					System.out.println(GT.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + GT.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + GT.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + GT.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Crash Racing
				else if(SelName.toLowerCase().equals("crash racing")){
					System.out.println("                                                                            ");
					System.out.println(CR.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + CR.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + CR.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + CR.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Last Of Us Remastered
				else if(SelName.toLowerCase().equals("last of us remastered")){
					System.out.println("                                                                            ");
					System.out.println(LOUR.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + LOUR.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + LOUR.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + LOUR.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Days Gone
				else if(SelName.toLowerCase().equals("days gone")){
					System.out.println("                                                                            ");
					System.out.println(DG.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + DG.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + DG.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + DG.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Sekiro
				else if(SelName.toLowerCase().equals("sekiro")){
					System.out.println("                                                                            ");
					System.out.println(SKR.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + SKR.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + SKR.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + SKR.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Mass Effect
				else if(SelName.toLowerCase().equals("mass effect")){
					System.out.println("                                                                            ");
					System.out.println(ME.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + ME.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + ME.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + ME.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//Driver
				else if(SelName.toLowerCase().equals("driver")){
					System.out.println("                                                                            ");
					System.out.println(DR.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + DR.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + DR.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + DR.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//The Crew
				else if(SelName.toLowerCase().equals("the crew")){
					System.out.println("                                                                            ");
					System.out.println(TC.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + TC.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + TC.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + TC.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//God Of War Trilogy
				else if(SelName.toLowerCase().equals("god of war trilogy")){
					System.out.println("                                                                            ");
					System.out.println(GOWT.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + GOWT.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + GOWT.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + GOWT.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				//No Man's Sky
				else if(SelName.toLowerCase().equals("no man's sky")){
					System.out.println("                                                                            ");
					System.out.println(NMS.Price + "$");
					System.out.println("                                                                            ");
					System.out.println("How would you like to Pay ? ");
					System.out.println("Press 1 for cash."
							+ "		  Press 2 for UPI"
							+ "		  Press 3 for CreditCard: ");
					System.out.print("Enter : ");
					int paymentMethod = sc.nextInt();
					while(paymentMethod != 1 && paymentMethod != 2 && paymentMethod != 3) {
						System.out.print("Please Choose Correctly  : ");
						paymentMethod = sc.nextInt();
					}
					System.out.println(" ======================================================================= ");
					switch(paymentMethod) {
					case 1 : System.out.println("Thanks. You paid " + NMS.Price + "$ by cash");
					break;
					case 2 : System.out.println("Thanks. You paid " + NMS.Price + "$ by UPI");
					break;
					case 3 : System.out.println("Thanks. You paid " + NMS.Price + "$ by CreditCard");
					break;
				}
					System.out.println(" ======================================================================== ");
					game();
				}
				sc.close();
				}
				
		
	//Game
		public static void game() {
		Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 6;
        System.out.print("Do you want to play a game for a surprise ? (Y/N) ");
        System.out.println("                                                                            ");
        String choiceToPlay = sc.next();
        while(!choiceToPlay.contains("N") && !choiceToPlay.contains("Y")) {
        	System.out.println("Try Again : ");
        	choiceToPlay = sc.next();        }
        if(choiceToPlay.equals("Y")) {
        	System.out.println("                                                                            ");
        	System.out.println("Welcome To Guess That Number ");
        	System.out.println("                                                                            ");
        	System.out.println("Select a Random Number Between 1-6 ");
        	System.out.println("                                                                            ");
        	System.out.println("If You Choose the Correct Number.You'll Get Your Paid Amount Back and would get to take the game home for Free !!!");
        	System.out.println("                                                                            ");
        	System.out.print("Enter Your Number : ");
        	int ranNum = sc.nextInt();
        	while(ranNum > 6) {
        		System.out.print("Please select a valid number in the specified range : ");
        		ranNum = sc.nextInt();
        		
        	}
        	int b = (int)(Math.random()*(max-min+1)+min); 
        		if(ranNum == b){
        			System.out.println("The Random Number is : " + b);
        			System.out.println("                                                                            ");
        				System.out.println("You Win!! You get to take the game home for Free !!!!!");
        				System.out.println(" ======================================================================= ");
        				System.out.println("Thank You. Come Back Again");
        			}
        		else{
        				System.out.println("You Lose");
        				System.out.println("                                                                            ");
        				System.out.println("The Random Number was : " + b);
        				System.out.println(" ======================================================================= ");
        				System.out.println("Thank You. Come Back Again ");
        			}
        }
        else {
        	System.out.println("Thank You. Come Back Again ");
        }

        		sc.close();
		}
		
}

 