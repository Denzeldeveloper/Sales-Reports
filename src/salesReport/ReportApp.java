package salesReport;


public class ReportApp {

	public static void main( String args[] )   
    {                                           
		int option;
        
        ReportAppManager manager = new ReportAppManager();
        
        do 
        {
            option = manager.mainMenu();
            
        switch(option)
        {
        case 1 : manager.addSale();
                 break;
    //    case 2 : manager.listAllSales();
    //             break;
    //    case 3 : manager.deleteSale();
    //             break; 
    //    case 4 : manager.searchForSale();
    //             break;
    //    case 5 : manager.advancedOpt; 
    //    	     break;
        case 6 : 
        default : break;
        }  
        }while(option !=6);
	
}
} 
