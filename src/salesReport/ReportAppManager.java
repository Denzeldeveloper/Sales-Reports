package salesReport;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ReportAppManager {
	
	public int mainMenu() 
	{
		int option=0;
		
		String opt1 = new String("1. Add Sales Report ");
		String opt2 = new String("2. List all Sales ");
		String opt3 = new String("3. Cancel Sales Report ");
		String opt4 = new String("4. Search for Sale ");
		String opt5 = new String("5. Advanced Options:");
		String opt6 = new String("6. Exit");
		String msg = new String("Enter Option:");
		JTextField opt = new JTextField("");
		
		Object message[] = new Object[8];

		message[0] = opt1;
		message[1] = opt2;
		message[2] = opt3;
		message[3] = opt4;
		message[4] = opt5;
		message[5] = opt6;
		message[6] = msg;
		message[7] = opt;    

		int response = JOptionPane.showConfirmDialog(null,message,"Sales Entry System",JOptionPane.OK_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE );
		
		if(response == JOptionPane.CANCEL_OPTION)
			System.exit(0);
		    
		    else                                 
		    {
		    try {
		        option = Integer.parseInt( opt.getText());
		        }
		    catch(NumberFormatException nfe)
		        {
		    	System.out.print(nfe.toString());
		        JOptionPane.showMessageDialog(null,"Data Input Error! " + nfe + "\nPlease enter a valid option!");
		        }
		    }
		 return option;
	}
	
	public void addSale()
	{
		int customerId = 0000;
		customerId++;
		
		JTextField customerName= new JTextField();
		JTextField customerAddress = new JTextField(); 
		JTextField customerEmail= new JTextField();
		JTextField customerDOB = new JTextField(); 
		
		JComboBox<String> carMake;
		String[] make = { "Ford", "Kia", "Nissan" };
		carMake = new JComboBox(make);
		
		Object [] message = new Object[12];

		message[0] = "Customer ID: ";
		message[1] = customerId;
		message[2] = "Customer name: ";
		message[3] = customerName;
		message[4] = "Customer address: ";
		message[5] = customerAddress;
		message[6] = "Customer email: "; 
		message[7] = customerEmail;
		message[8] = "Customer DOB: ";
		message[9] = customerDOB;
		message[10] = "Car make: ";
		message[11] = carMake;
		
		int option = JOptionPane.showConfirmDialog(null,message, "Customer Details Entry",  JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null);
		//return option;
		
		if(carMake.getSelectedItem().equals("Ford"))
		{
			int salesId = 0000;
			salesId++;
			
			JComboBox<String> carModel;
			String[] model1 = { "Ka", "Fiesta", "Focus", "Mondeo", "Kuga" };
			JComboBox<String> carColour;
			String[] colour = { "Red", "Green", "Black", "Silver", "Blue", "White" };
			JComboBox<String> carFuel;
			String[] fuel = { "Petrol", "Diesel", "Electric" };
			JTextField carRegTf= new JTextField();
			JTextField costTf = new JTextField(); 
			
			carModel = new JComboBox(model1);
			carColour = new JComboBox(colour);
			carFuel = new JComboBox(fuel);
			
			Object [] item = new Object[12];

			item[0] = "Sales ID: ";
			item[1] = salesId;
			item[2] = "Car model: ";
			item[3] = carModel;
			item[4] = "Car reg: "; 
			item[5] = carRegTf;
			item[6] = "Colour: ";
			item[7] = carColour;
			item[8] = "Fuel type: ";
			item[9] = carFuel;
			item[10] = "Total cost: ";
			item[11] = costTf;
			
			int response = JOptionPane.showConfirmDialog(null,item, "Sales Entry",  JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null);
			
		}
		else if(carMake.getSelectedItem().equals("Kia"))
		{
			int salesId = 0000;
			salesId++;
			
			JComboBox<String> carModel;
			String[] model2 = { "Picanto", "Rio", "Soul", "Optima", "Sportage" };
			JComboBox<String> carColour;
			String[] colour = { "Red", "Green", "Black", "Silver", "Blue", "White" };
			JComboBox<String> carFuel;
			String[] fuel = { "Petrol", "Diesel", "Electric" };
			JTextField carRegTf= new JTextField();
			JTextField costTf = new JTextField(); 
			
			carModel = new JComboBox(model2);
			carColour = new JComboBox(colour);
			carFuel = new JComboBox(fuel);
			
			Object [] item = new Object[12];

			item[0] = "Sales ID: ";
			item[1] = salesId;
			item[2] = "Car model: ";
			item[3] = carModel;
			item[4] = "Car reg: "; 
			item[5] = carRegTf;
			item[6] = "Colour: ";
			item[7] = carColour;
			item[8] = "Fuel type: ";
			item[9] = carFuel;
			item[10] = "Total cost: ";
			item[11] = costTf;
			
			int response = JOptionPane.showConfirmDialog(null,item, "Sales Entry",  JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null);
			
		}
		else if(carMake.getSelectedItem().equals("Nissan"))
		{
			int salesId = 0000;
			salesId++;
			
			JComboBox<String> carModel;
			String[] model3 = { "Leaf", "Micra", "Note", "Pulsar", "Juke", "Qashqai" };
			JComboBox<String> carColour;
			String[] colour = { "Red", "Green", "Black", "Silver", "Blue", "White" };
			JComboBox<String> carFuel;
			String[] fuel = { "Petrol", "Diesel", "Electric" };
			JTextField carRegTf= new JTextField();
			JTextField costTf = new JTextField(); 
			
			carModel = new JComboBox(model3);
			carColour = new JComboBox(colour);
			carFuel = new JComboBox(fuel);
			
			Object [] item = new Object[12];

			item[0] = "Sales ID: ";
			item[1] = salesId;
			item[2] = "Car model: ";
			item[3] = carModel;
			item[4] = "Car reg: "; 
			item[5] = carRegTf;
			item[6] = "Colour: ";
			item[7] = carColour;
			item[8] = "Fuel type: ";
			item[9] = carFuel;
			item[10] = "Total cost: ";
			item[11] = costTf;
			
			int response = JOptionPane.showConfirmDialog(null,item, "Sales Entry",  JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null);
			
		}
	}
	
	/*public void addSale()
	{
		int salesId = 000000;
		salesId++;
		
		JComboBox<String> carMake;
		String[] make = { "Ford", "Kia", "Nissan" };
		JComboBox<String> carModel;
		String[] model1 = { "Ka", "Fiesta", "Focus", "Mondeo", "Kuga" };
		String[] model2 = { "Picanto", "Rio", "Soul", "Optima", "Sportage" };
		String[] model3 = { "Leaf", "Micra", "Note", "Pulsar", "Juke", "Qashqai" };
		JComboBox<String> carColour;
		String[] colour = { "Red", "Green", "Black", "Silver", "Blue", "White" };
		JComboBox<String> carFuel;
		String[] fuel = { "Petrol", "Diesel", "Electric" };
		JComboBox<String> carEngine;
	    String[] size1 = { "1.0 Litre", "1.2 Litre", "1.4 Litre", "1.6 Litre", "1.8 Litre", "2.0 Litre"};
		String[] size2 = { "1.6 Litre", "1.8 Litre", "2.0 Litre", "2.2 Litre" };  
		JTextField carRegTf= new JTextField();
		JTextField costTf = new JTextField(); 
		
		carMake = new JComboBox(make);
		carModel = new JComboBox(model1);
		carColour = new JComboBox(colour);
		carFuel = new JComboBox(fuel);
		carEngine = new JComboBox(size1); 
		
		Object [] message = new Object[18];

		message[0] = "Sales ID: ";
		message[1] = salesId;
		message[2] = "Car make: ";
		message[3] = carMake;
		message[4] = "Car model: ";
		message[5] = carModel;
		message[6] = "Car reg: "; 
		message[7] = carRegTf;
		message[8] = "Colour: ";
		message[9] = carColour;
		message[10] = "Fuel type: ";
		message[11] = carFuel;
		message[12] = "Engine size: ";
		message[13] = carEngine;  
		message[14] = "Total cost: ";
		message[15] = costTf;
		
		carModel.addActionListener(new ActionListener()  
		{
			public void actionPerformed(ActionEvent e) 
			{
			  if(carModel.getSelectedItem().equals("Ford"))
			  {
				 carModel.setModel(model1);
			  }
			  else if(carModel.getSelectedItem().equals("Kia"))
			  {
						
			  }
			  else if(carModel.getSelectedItem().equals("Nissan"))
			  {
						
			  }
			}
		});  
		
		
		int option = JOptionPane.showConfirmDialog(null,message, "Sales Entry",  JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null);
		//return option;
	}  */

}
