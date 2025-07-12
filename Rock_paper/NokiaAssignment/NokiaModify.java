import java.util.Scanner;
public class NokiaModify {
   public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	boolean running = true; // boolean to turn off 

	while (running) { // main menus while loop start
	   System.out.println("""


	1. PhoneBook 
	2. Messages
	3. Chat
	4. Call register
	5. Tones
	6. Settings
	7. Call divert
	8. Games
	9. Calculator
	10. Reminders
	11. Clock
	12. Profiles
	13. Sim services
	14. Turn Off
		     """);

System.out.print("Choose an option: ");	
int mainChoice = scanner.nextInt(); // collect input for main menu

switch (mainChoice) {   // phonebook starts 

	case 1 -> { // case for phonebook
				
	boolean inPhoneBook = true; 
	while (inPhoneBook) {    //while loop for phone book starts
	System.out.println("""

		Phone book 
		1. Search
		2. Service Nos
		3. Add name
		4. Erase 
		5. Edit				 	
		6. Assign tone
		7. Send b'card
		8. Options
		 1. Type of view
		 2. Memory Status
		9. Speed dials
		10. Voice tags
		11. Back 
			""");
System.out.print("Choose an option: ");
int phoneBookChoice = scanner.nextInt();

switch (phoneBookChoice) { // switch for phoneBook nav
case 1-> { 
	System.out.println("search");  
	boolean searching = true;
	while (searching) {
	System.out.println("""
	1. Back
	  """);
			
	System.out.print("Choose an option: ");
	int searchBack = scanner.nextInt();
	switch (searchBack){
	case 1->  searching = false;
	default-> System.out.println("Choose a valid option");

	}//switch search ends

	}// case opening search ends

}// switch phoneBookChoice ends
case 2-> {// service nos case starts
System.out.println("Service Nos");
boolean serviceNos = true; 
while (serviceNos) { // service Nos while loop starts

System.out.println("""
1. Back
	 """);
System.out.print("Choose an option: ");
int serviceNo = scanner.nextInt();
switch (serviceNo){// serviceNo switch ends
case 1-> serviceNos = false;
 default-> System.out.println("Choose a valid option");

}//serviceNo switch ends

}//service Nos while loop starts

}//service nos case ends

case 3-> {
System.out.println("Add name");
boolean addName = true;
while (addName) { // addname while loop starts
System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");

int addNames = scanner.nextInt();
switch(addNames) {//switch addnames start
 case 1-> addName = false;
default -> System.out.println("Choose a valid option");

}//switch addNames end	
			
}//while loop addNames end
}//case addnames end

case 4-> {
System.out.println("Erase");
boolean erase = true;
while (erase) { // erase while loop starts
System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
 int eraseBack = scanner.nextInt();
switch(eraseBack) { //switch eraseback start
case 1-> erase = false;
default -> System.out.println("Choose a valid option");
} //eraseback switch ends

} //eraseback while loop ends
}//case erase ends

case 5-> {
System.out.println("Edit");
boolean edit = true;
while (edit) { // erase while loop starts
System.out.println("""
1. Back
	 """);

	System.out.print("Choose an option: ");
	int editBack = scanner.nextInt();
	switch (editBack) { 
	case 1-> edit = false;
	default-> System.out.println("Choose a valid option");
	 }//switch edit case ends
	}//edit while loop ends
	}//edit case ends


	case 6-> {
	System.out.println("Assign tone");
	 boolean assignTone = true;
	while (assignTone) { // assign tone while loop starts
	System.out.println("""
	1. Back
		  """);

System.out.print("Choose an option: ");
 int assignTones = scanner.nextInt(); 
switch (assignTones) {

case 1-> assignTone = false;
 default-> System.out.println("Choose a valid option");
}//switch assign tone ends  
}//assignTone while loop ends
 }// case assignTone ends


case 7-> {
System.out.println("Send b'card");
 boolean bcard = true;
while (bcard) { // while loop starts
System.out.println("""
1. Back
  """);

System.out.print("Choose an option: ");
int bcards = scanner.nextInt(); 
 switch (bcards) {
 case 1-> bcard = false;
default-> System.out.println("Choose a valid option");

}
}
}

 case 8-> { // options in phoneBook starts
boolean phonebookOptions = true; // 
while (phonebookOptions) { //  while loop for phone book options start
 System.out.println("""

1. Type of view
2. Memory status
3. Back
 """);
		
System.out.print("Choose an option: ");
int optionsPhoneBook = scanner.nextInt();

switch (optionsPhoneBook) { //switch for options sub menu in phonebook
 case 1-> {
System.out.println("Type of view");
boolean typeOfV = true;
while (typeOfV) {
System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
 int typeOfVback = scanner.nextInt();
 switch (typeOfVback) {
case 1-> typeOfV = false;
default-> System.out.println("Choose a valid option");
}
 }
}

case 2-> {
System.out.println("memory status");
 boolean checkMemStatus = true;
 while (checkMemStatus) {
System.out.println("""
1. Back
  """);

System.out.print("Choose an option: ");
  int checkMem = scanner.nextInt();
switch (checkMem) {
case 1-> checkMemStatus = false;
 default-> System.out.println("Choose a valid option");
}
}

}
 case 3-> phonebookOptions = false;
default -> System.out.println("Choose a valid option");
}// end of options in phonebook switch
	
}//  	
		     
 } // 
		   
case 9-> {
System.out.println("speed dials");
boolean speedDial = true;
while (speedDial) {
  System.out.println("""
1. Back
  """);

System.out.print("Choose an option: ");
int speedDials = scanner.nextInt();
 switch (speedDials) {
 case 1-> speedDial = false;
default-> System.out.println("Choose a valid option");
}//end of speed dial back switch		     
}//end of speed dials loop

 }//end of speed dials case
		   
case 10-> {
System.out.println("voice tags");
 boolean voiceTag = true;
while (voiceTag) {
 System.out.println("""
1. Back
    """);

System.out.print("Choose an option: ");
int voiceTags = scanner.nextInt();
 switch (voiceTags) {
case 1-> voiceTag = false;
default -> System.out.println("Choose a valid option");
 }//end of voice tag switch
}//end of while loop for voiceTag
}//end of voice tags case
case 11-> inPhoneBook = false;
 default-> System.out.println("Choose a valid option");

 }// end of phoneBook switch
	      	     
} // while loop for phonebook ends 

}//  case for phonebook ends

case 2-> { //case messages starts
boolean inMessage = true; //boolean for message menu
while(inMessage) {
 System.out.println("""

1. Write Messages
2. Inbox
3. Outbox
4. Picture Messages
5. Templates
6. Smileys
7. Message settings
 1. Set 1 
 1. Message centre number
 2. Message sent as 
 3. Message validity
				      	 
 2. Common
 1. Delivery reports
 2. Reply via same centre
 3. Character support


8. Info service
9. Voice mailbox number
10. Service command editor
11. Back


 """); 

System.out.print("Choose an option: ");
int messageChoice = scanner.nextInt();

 switch (messageChoice) {
case 1-> { 
System.out.println("New messages");
 boolean writeMessage = true;
while (writeMessage) {
System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
int writeMessages = scanner.nextInt();

 switch (writeMessages) {
case 1-> writeMessage = false;
default-> System.out.println("Choose a valid option");

}//write message switch case ends
}//new message while loop ends
}// new message case ends

case 2-> {
System.out.println("inbox");
boolean inbox = true;
while (inbox) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
int inboxChoice = scanner.nextInt();
switch (inboxChoice) {
 case 1-> inbox = false;
 default-> System.out.println("Choose a valid option");
}// end of switch inbox
}// end of inbox while loop
 }// end of inbox case

case 3-> { 
System.out.println("outbox");
boolean outbox = true;
while (outbox) {
System.out.println("""
1. Back
  """);

System.out.print("Choose an option: ");
int outboxChoice = scanner.nextInt();
 switch (outboxChoice) {
case 1-> outbox = false;
 default-> System.out.println("Choose a valid option");

}// switch outbox ends
}//outbox while loop ends

}// Outbox case ends
		
case 4-> {
System.out.println("Picture Message");
boolean picMessage = true;
 while (picMessage) {
System.out.println("""
1. Back
  """);

System.out.print("Choose an option: ");
 int picMessages = scanner.nextInt();
switch (picMessages) {
case 1-> picMessage = false;
default-> System.out.println("Choose a valid option");
}	
}
}// pic message case ends

case 5-> {
System.out.println("Templates");
boolean templates = true;
while (templates) {
System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
int template = scanner.nextInt();
 switch (template) {
case 1-> templates = false;
default-> System.out.println("Choose a valid option");	
}
 }
} // end of templates case
			
case 6-> {
System.out.println("Smiley options");
 boolean smiley = true;
 while (smiley) {
System.out.println("""
1. Back
  """);

System.out.print("Choose an option: ");
 int smileys = scanner.nextInt();
 switch (smileys) {
case 1-> smiley = false;
 default-> System.out.println("Choose a valid option");	
}
 }
}// end of smiley case

case 7-> {
			    
boolean messageSet = true;
 while (messageSet) {
System.out.println("""
1. Set 1	
1. Message centre number 
2. Message sent as 
3. Message validity
4. Back
2. Common
1. Delivery reports
2. Reply via same centre
3. Character support
4. Back
Press 3 to go back to the last menu
 """);
System.out.print("Choose an option: ");
 int messageSettings = scanner.nextInt();

switch (messageSettings) {
 case 1-> {
boolean set1 = true;
while (set1) {  
 System.out.println("""
1. Message centre number
2. Message sent as
3. Message validity
4. Back
""");
System.out.print("Choose an option: ");
 int messageSett = scanner.nextInt();
switch (messageSett) {
 case 1-> {
 System.out.println("Message centre number");
 boolean messageCentre = true;
 while (messageCentre) {
System.out.println("""
1. Back
  """);

System.out.print("Choose an option: ");
 int messageCentres = scanner.nextInt();
switch (messageCentres) {
case 1-> messageCentre = false;
default-> System.out.println("Choose a valid option");
}// switch message center ends
}// message center while loop ends
}// message center case ends

case 2-> {
System.out.println("Message sent");
boolean messageSent = true;
while (messageSent) {
 System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
int messageSents = scanner.nextInt();
switch (messageSents) {
 case 1-> messageSent = false;
 default-> System.out.println("Choose a valid option");
}
}
}// case message sent as ends
		
 case 3-> {
System.out.println("Message validity");
 boolean messageValidity = true;
 while (messageValidity) {
System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
 int messageValiditys = scanner.nextInt();
switch (messageValiditys) {
case 1-> messageValidity = false;
default-> System.out.println("Choose a valid option");
}
}
 }// case message validity
		
case 4-> set1 = false;
default -> System.out.println("Choose a valid option");

}//switch case ends
}// while loop ends
}// 1st sub case under message settings

case 2-> { 
 boolean common = true;
while (common) {  
System.out.println("""
1. Delivery Report
2. Reply Via same Centre
3. Character support
4. Back
""");
System.out.print("Choose an option: ");
int commonMenu = scanner.nextInt();
switch (commonMenu) {
case 1-> {
System.out.println("Delivery Reports");
 boolean deliveryReport = true;
while (deliveryReport) {
 System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
 int deliveryReports = scanner.nextInt();
switch ( deliveryReports) {
  case 1->  deliveryReport = false;
default-> System.out.println("Choose a valid option");
}
}
 }// delivery report case end

 case 2-> { 
System.out.println("Reply via same Center");
boolean SameCentre = true;
while (SameCentre) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
int SameCentres = scanner.nextInt();
switch ( SameCentres) {
case 1->  SameCentre = false;
default-> System.out.println("Choose a valid option");
}
}
}// reply via same centre ends

case 3-> {
System.out.println("Character Support");
 boolean CharacterSpt = true;
while (CharacterSpt) {
System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
int CharacterSpts = scanner.nextInt();
switch ( CharacterSpts) {
case 1->  CharacterSpt = false;
default-> System.out.println("Choose a valid option");
}
}
 }// character support case ends

 case 4-> common = false;
default-> System.out.println("Choose a valid option");
	
}
 }
}// commons menu stop
case 3-> messageSet = false;
default-> System.out.println("Choose a valid option");

}

}
}// case 7 of messages ends
		
case 8-> {
System.out.println("info service");
boolean infoService = true;
while (infoService) {
System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
 int infoServices = scanner.nextInt();
 switch ( infoServices) {
 case 1->  infoService = false;
default-> System.out.println("Choose a valid option");
}
}
 }//info service case ends

 case 9-> {
System.out.println("voice mail");
boolean voicemail = true;
 while (voicemail) {
System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
int voicemails = scanner.nextInt();
switch ( voicemails) {
 case 1->  voicemail = false;
default-> System.out.println("Choose a valid option");
}
}
 }// voice mailbox ends

 case 10-> {
 System.out.println("Service command editor");
boolean commandEditor = true;
 while (commandEditor) {
System.out.println("""
1. Back
  """);

System.out.print("Choose an option: ");
int commandEditors = scanner.nextInt();
switch ( commandEditors) {
case 1->  commandEditor = false;

default-> System.out.println("Choose a valid option");
}
}
}// Service command editor ends

case 11-> inMessage = false; // back button for message menu 
default-> System.out.println("Choose a valid option");
 
		 
 }// switch for message choice ends

}// inMessages while loop ends
}// case messages end

case 3-> {
System.out.println("Chats");
boolean chat = true;
while (chat) {
System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
int chats = scanner.nextInt();
switch ( chats) {
case 1->  chat = false;
default-> System.out.println("Choose a valid option");
}
}
}// chat case ends     

case 4-> {
	boolean callRegister = true;
	while (callRegister) {
	System.out.println("""
	1. Missed calls
	2. Recieved calls
	3. Dialled calls
	4. Erase recent calls
	5. Show call duration
	 1. Last call duration
	 2. All calls' duration
	 3. Recieved calls' duration
	 4. Dialled calls' duration
	 5. Clear timers
	 6. Show call costs
	 1. Last call costs
	  2. All calls' cost
	  3. Clear counters
	 7. Call cost settings
	 1. Call cost limit
	 2. Show costs in
	 8. Prepaid credit
		
	Press 9 to return to previous menu
		""");

	System.out.print("Choose an option: ");
	 int callRegisters = scanner.nextInt();
	switch (callRegisters) { 
case 1-> {
	System.out.println("missed calls");
	 boolean missedCall = true;
	 while (missedCall) {
	 System.out.println("""
	 1. Back
		 """);

	System.out.print("Choose an option: ");
	int missedCalls = scanner.nextInt();
	switch ( missedCalls) {
	case 1->  missedCall = false;
	default-> System.out.println("Choose a valid option");
	}
	}
	}// case missed calls end			

	case 2-> {
	System.out.println("recieved calls");
	boolean recievedcall = true;
	while (recievedcall) {
	System.out.println("""
	1. Back
		 """);

	System.out.print("Choose an option: ");
	int recievedcalls = scanner.nextInt();
	switch ( recievedcalls) {
	case 1->  recievedcall = false;
	 default-> System.out.println("Choose a valid option");

	}
	}
	}// case recieved calls end

	case 3-> {
	System.out.println("Dialled calls");
	boolean dialedcall = true;
	while (dialedcall) {
	System.out.println("""
	1. Back
	""");

	System.out.print("Choose an option: ");
	int dialedcalls = scanner.nextInt();
	 switch ( dialedcalls) {
	case 1->  dialedcall = false;
	default-> System.out.println("Choose a valid option");
	}
	}

	 }// recieved calls case end

	 case 4-> {
	System.out.println("Erase recent call list");
	boolean callList = true;
	 while (callList) {
	System.out.println("""
	1. Back
	 """);

System.out.print("Choose an option: ");
	int callLists = scanner.nextInt();
	 switch ( callLists) {
	case 1->  callList = false;
	default-> System.out.println("Choose a valid option");
	}
	}
		
	 }	// call list case ends

	case 5-> {			
	 boolean callDuration = true;
	 while (callDuration) {
	System.out.println("""
			     
	1. Last call duration
	2. All calls' duration
	3. Recieved calls' duration
	4. Dialled calls' duration
	5. Clear timers
	press 6 to return to previous menu 
	""");

	System.out.print("Choose an option: ");
	 int callDurationChoice = scanner.nextInt();
	switch (callDurationChoice) {
	case 1-> {
	System.out.println("last call duration");
	boolean lastcallDuration = true;

while (lastcallDuration) {
	 System.out.println("""
	1. Back
	""");

	System.out.print("Choose an option: ");
	 int lastcallDurations = scanner.nextInt();
	 switch (lastcallDurations) {
	 case 1->  lastcallDuration = false;
	default-> System.out.println("Choose a valid option");
	}
	}
	 }// last call duration end case
		     
	case 2-> {
	System.out.println("All calls' duration here");
	 boolean allCallsDuration = true;
	 while (allCallsDuration) {
	System.out.println("""
	1. Back
	 """);

	System.out.print("Choose an option: ");
	int allCallsDurations = scanner.nextInt();
	switch (allCallsDurations) {
	case 1->  allCallsDuration = false;
	 default-> System.out.println("Choose a valid option");
       }
	}
	}// end of all calls duration case

	case 3-> {
	System.out.println("recieved calls' duration");
	boolean recieved = true;
	 while (recieved) {
	 System.out.println("""
	1. Back
		""");

	System.out.print("Choose an option: ");
	 int recieveds = scanner.nextInt();
	 switch (recieveds) {
	case 1->  recieved = false;
	default -> System.out.println("Choose a valid option");
	}
	}
	 }// recieved calls duration case ends

	case 4-> {
	System.out.println("Dialled calls' duration");
	boolean dialled = true;
	while (dialled) {
	System.out.println("""
	1 Back
	 """);

	System.out.print("Choose an option: ");
	int dialleds = scanner.nextInt();
	switch (dialleds) {
	case 1->  dialled = false;
	default-> System.out.println("Choose a valid option");
	}
	}
	}// end of dialled calls duration case
		      
	case 5-> {
	System.out.println("Clear timers");
	 boolean inCleartimer = true;
	while (inCleartimer) {
	 System.out.println("""
	1. Back
	 """);

	System.out.print("Choose an option: ");
	 int inCleartimers = scanner.nextInt();
	switch (inCleartimers) {
	 case 1->  inCleartimer = false;
	default-> System.out.println("Choose a valid option");
	}
	 }
	 }// end of case for clear timers

	case 6 -> callDuration = false;
	default -> System.out.println("Choose a valid option");
	}
	}
	}//call duration end case

	case 6-> { 
	boolean incallCost = true;
	while (incallCost) {
	System.out.println( """ 

	1. Last call cost
	2. All calls' cost
	3. Clear Counters
	press 4 to go back to last menu

	 """);
	System.out.println("Choose an option: ");
	int callcost = scanner.nextInt();
	switch (callcost) {					
	case 1-> { 
	System.out.println("last call cost");
	 boolean inlastCost = true;
	 while (inlastCost) {
	System.out.println("""
	1. Back
	  """);

	System.out.print("Choose an option: ");
	 int inlastCosts = scanner.nextInt();
	switch (inlastCosts) {

	case 1->  inlastCost = false;
	 default-> System.out.println("Choose a valid option");
	}
	}
	}// ends case last call cost
			
	case 2-> { 
	System.out.println("All call cost");
	 boolean inAllCost = true;
	while (inAllCost) {
	System.out.println("""
	1. Back
	 """);

	System.out.print("Choose an option: ");
	 int inAllCosts = scanner.nextInt();
	switch (inAllCosts) {
	case 1->  inAllCost = false;
	default-> System.out.println("Choose a valid option");
	}
	}
	}// All costs case end

	case 3-> {
	System.out.println("Clear counter");
	boolean inClearCost = true;
	while (inClearCost) {
	System.out.println("""
	1. Back
	 """);

	System.out.print("Choose an option: ");
	int inClearCosts = scanner.nextInt();
	switch (inClearCosts) {
	case 1->  inClearCost = false;
	default-> System.out.println("Choose a valid option");
	}
	}
	}// case clear counter ends
	case 4-> incallCost = false;
	default -> System.out.println("Choose a valid option");
	}
	 }
	}// call cost case end
		     
	case 7-> { 
	 boolean inCostSetting = true;
	while (inCostSetting) {
	System.out.print("""

	1. Call cost limit
	2. Show cost in
	 press 3 to return to last menu
		""");

	System.out.print("Choose an option: ");
	int inCostSettings = scanner.nextInt();

	switch (inCostSettings) {
	case 1-> {
	System.out.println("call cost limit");
	boolean inCallCostLimit = true;
	while (inCallCostLimit) {
	System.out.println("""
	1. Back
		""");

	System.out.print("Choose an option: ");
	int inCallCostLimits = scanner.nextInt();
	switch (inCallCostLimits) {
	case 1->  inCallCostLimit = false;
	default-> System.out.println("Choose a valid option");
	}
	 }

	}// Call cost limit case

	case 2-> { 
	System.out.println("Show cost");
	boolean inShowCost = true;
	while (inShowCost) {
	 System.out.println("""
	1. Back
	  """);

	System.out.print("Choose an option: ");
	 int inShowCosts = scanner.nextInt();
	switch (inShowCosts) {
	case 1->  inShowCost = false;
	 default-> System.out.println("Choose a valid option");
	}
	}
	}// show cost in case ends

	case 3-> inCostSetting = false;
     	default-> System.out.println("Choose a valid option");
	}
	}
	}// call cost settings case ends		
		     
	case 8-> {
	System.out.println("prepaid credit");
	boolean inPrepaid = true;
	 while (inPrepaid) {
	 System.out.println("""
	1. Back
		 """);

	System.out.print("Choose an option: ");
	int inPrepaids = scanner.nextInt();
	switch (inPrepaids) {
	 case 1->  inPrepaid = false;
	default-> System.out.println("Choose a valid option");
	}
	}
	}// case prepaid credit ends

	case 9 -> callRegister = false;
	 default -> System.out.println("Choose a valid option");
	}
	}
	}// call register case ends

	case 5-> { 
	boolean inTone = true;
	 while (inTone) {
	System.out.println("""
	1. Ringing Tone
	2. Ringing Volume
	3. Incoming call alerts
	4. Composer
	5. Message alert tone
	6. Keypad Tones
	7. Warning and games tones
	8. Vibrating alert
	9. Screen Saver
	press 10 to return to previous menu
		""");

	System.out.print("Choose an option: ");
	int inTones = scanner.nextInt();
	switch (inTones) {
	case 1-> {
	System.out.println("Ringing tone");
	boolean inRingingTone = true;
	while (inRingingTone) {
	System.out.println("""
	1. Back
	  """);

	System.out.print("Choose an option: ");
	int inRingingTones = scanner.nextInt();
	switch (inRingingTones) {
	case 1->  inRingingTone = false;
	default-> System.out.println("Choose a valid option");
	}
	}// end of ringing tone while loop 
	}//end of ringing tone case
		     
	case 2-> { 
	System.out.println("Ringing volume");
	boolean inRingingVolume = true;
	 while (inRingingVolume) {
	System.out.println("""
	1. Back
	""");

	System.out.print("Choose an option: ");
	int inRingingVolumes = scanner.nextInt();
	switch (inRingingVolumes) {
	case 1->  inRingingVolume = false;
	default-> System.out.println("Choose a valid option");
	}
	} 
	}// end of ringing volume case

	case 3-> { 
	 System.out.println("incoming call alert");
	boolean incomingAlert = true;
	while (incomingAlert) {
	System.out.println("""
	1. Back
	  """);

	System.out.print("Choose an option: ");
	 int incomingAlerts = scanner.nextInt();
	switch (incomingAlerts) {
	case 1->  incomingAlert = false;
	 default-> System.out.println("Choose a valid option");
	}
	}
	 }// end of incoming call alert case

	case 4-> { 
	System.out.println("Composer");
	boolean inComposer = true;
	while (inComposer) {
	System.out.println("""
	1. Back

	""");

	System.out.print("Choose an option: ");
	 int inComposers = scanner.nextInt();
	switch (inComposers) {
	case 1->  inComposer = false;
	default-> System.out.println("Choose a valid option");
	}
	}

	}// end of composer case

	case 5-> {
	 System.out.println("message alert tone");
	boolean alertTone = true;
	 while (alertTone) {
	System.out.println("""
	1. Back
	""");

	System.out.print("Choose an option: ");
	int alertTones = scanner.nextInt();
	switch (alertTones) {
	case 1->  alertTone = false;
	default-> System.out.println("Choose a valid option");
	}
	}
	 }// end of message alert tone 

	 case 6-> { 
	System.out.println("Keypad tones");
	boolean KeyPadTone = true;
	while (KeyPadTone) {
	System.out.println("""
	1. Back
	 """);

	System.out.print("Choose an option: ");
	 int KeyPadTones = scanner.nextInt();
	 switch (KeyPadTones) {
	case 1->  KeyPadTone = false;
	default-> System.out.println("Choose a valid option");
	}
	 }

	}// end of keypad tones

	case 7-> { 
	System.out.println("warning and gaming tones");
	boolean warningTune = true;
	while (warningTune) {
	System.out.println("""
	1. Back
	""");

	System.out.print("Choose an option: ");
	 int warningTunes = scanner.nextInt();
	 switch (warningTunes) {
	case 1->  warningTune = false;
	default-> System.out.println("Choose a valid option");
	}
	 }

	} // end of case for warning and game tones

	case 8-> {
	System.out.println("vibrating alert");
	boolean vibratingAlert = true;
	while (vibratingAlert) {
	System.out.println("""
	1. Back
	  """);

	System.out.print("Choose an option: ");
	int vibratingAlerts = scanner.nextInt();
	switch (vibratingAlerts) {
	case 1->  vibratingAlert = false;
	 default-> System.out.println("Choose a valid option");
	}
	 }

	}// end of vibrating alert case
	 case 9-> { 
	System.out.println("Screensaver");
	 boolean screenSaver = true;
while (screenSaver) {
System.out.println("""
1. Back
 """);

System.out.print("Choose an option: ");
 int screenSavers = scanner.nextInt();
 switch (screenSavers) {
case 1->  screenSaver = false;
default-> System.out.println("Choose a valid option");
 }
}
}// end of screen saver case

case 10-> inTone = false;
default-> System.out.println("Choose a valid option");

}
}// while loop for tones 
}// case Tones ends

case 6-> { 
 boolean inSettings = true;
 while (inSettings) { 
System.out.print("""
1. Call Settings
1. Automatic Redial
2. Speed dialing
3. Call Waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer
2. Phone Settings
1. Language
2. Cell info display
3. Welcome note
4. Network Selection
5. Lights
6. Confirm SIM service actions
				
3. Security settings
1. PIN code request
2. Call barring service
3. Fixed dialling
4. Closed user group
5. Phone security
6. Change access code
	
4. Restore to Factory default
				
press 5 to return to previous menu
"""); 

System.out.print("Choose an option: ");
int settingChoice = scanner.nextInt();
 switch (settingChoice) {
case 1-> {
boolean incallSettings = true;
while (incallSettings) {
System.out.println("""

1. Automatic redial
2. Speed dialling
3. Call Waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer 

press 7 to return to the previous menu
""");
System.out.print("Choose an option: ");
int callSettingOpt = scanner.nextInt();

switch (callSettingOpt) {		
case 1-> {
System.out.println("Automatic redial");
boolean automaticRedial = true;
while (automaticRedial) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
int automaticRedials = scanner.nextInt();
switch (automaticRedials) {
case 1->  automaticRedial = false;
default-> System.out.println("Choose a valid option");
}
}
}// Case end for automatic redial
				
case 2-> { 
 System.out.println("speed Dialling");
boolean inSpeedDial = true;
while (inSpeedDial) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
int inSpeedDials = scanner.nextInt();
switch (inSpeedDials) {
case 1->  inSpeedDial = false;
default-> System.out.println("Choose a valid option");
 }
}
}// end of speed dialling case 

case 3-> {
System.out.println("Call waiting options");
boolean callWait = true;
while (callWait) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
int callWaits = scanner.nextInt();
switch (callWaits) {
case 1->  callWait = false;
default-> System.out.println("Choose a valid option");
 }
}

}// end of call waiting case

case 4-> { 
System.out.println("Own number sending");
boolean ownNumber = true;
while (ownNumber) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
int ownNumbers = scanner.nextInt();
switch (ownNumbers) {
case 1->  ownNumber = false;
 default-> System.out.println("Choose a valid option");
}
}

}//end of own number case
	
case 5-> { 
System.out.println("phone Line in use");
boolean inphoneNum = true;
while (inphoneNum) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
 int inphoneNums = scanner.nextInt();
switch (inphoneNums) {
case 1->  inphoneNum = false;
default-> System.out.println("Choose a valid option");
}
}
				
}// end of phone line in use case

case 6-> { 
 System.out.println("Automatic Answer");
boolean autoAnswer = true;
while (autoAnswer) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
int autoAnswers = scanner.nextInt();
switch (autoAnswers) {
case 1 ->  autoAnswer = false;
default-> System.out.println("Choose a valid option");
}
}

}// end of automatic answer
case 7-> incallSettings = false;
default-> System.out.println("Choose a valid option");

}// switch statements for call settings
}// end of incallSettings while loop
 }// end of call settings menu case

case 2-> { 
boolean inPhoneSettings = true; 
while (inPhoneSettings) {
System.out.println("""
1. Language
2. Cell info display
3. Welcome note
4. Network Selection
5. Lights
6. Confirms SIM service actions
press 7 to return to the previous menu
"""); 

System.out.print("Choose an option: ");
 int phoneSettings = scanner.nextInt();

switch (phoneSettings) {
 case 1-> { 
System.out.println("language");
boolean inLanguage = true;
while (inLanguage) {
int inlanguages = scanner.nextInt();
 switch (inlanguages) {
case 1->  inLanguage = false;
default-> System.out.println("Choose a valid option");

 }
 }
 }// language case ends
				
case 2-> { 
 System.out.println("Cell info display");
boolean cellInfo = true;
while (cellInfo) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
int cellInfos = scanner.nextInt();
 switch (cellInfos) {
case 1->  cellInfo = false;
default-> System.out.println("Choose a valid option");

 }
 }
}//end of cell info display case
				
case 3-> {
System.out.println("welcome note");
boolean welcomeNote = true;
while (welcomeNote) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
int welcomeNotes = scanner.nextInt();
switch (welcomeNotes) {
case 1->  welcomeNote = false;
default-> System.out.println("Choose a valid option");

}
}
}// end of welcome note case

case 4-> {
System.out.println("Network Selection");
boolean networkSelection = true;
while (networkSelection) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
int networkSelections = scanner.nextInt();
switch (networkSelections) {
case 1->  networkSelection = false;
default-> System.out.println("Choose a valid option");

 }
 }
}// end of network selection case
case 5-> { 
 System.out.println("Light");
boolean inLight = true;
while (inLight) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
int inLights = scanner.nextInt();
switch (inLights) {
case 1->  inLight = false;
default-> System.out.println("Choose a valid option");

}
 }
}// end of case for lights
case 6-> { 
System.out.println("SIM service action");
boolean simService = true;
while (simService) {
System.out.println("""
1. Back
""");
System.out.print("Choose an option: ");
int simServices = scanner.nextInt();
 switch (simServices) {
case 1->  simService = false;
default-> System.out.println("Choose a valid option");

}
 }
 }//end of case for confirm SIM service actions

case 7-> inPhoneSettings = false;
default-> System.out.println("Choose a valid option");

}
}// end of while loop for phone settings
}//end of phone settings case

			
case 3-> { 
boolean inSecurity = true;
while (inSecurity) {
 System.out.println("""

1. PIN code request
2. Call barring service
3. Fixed dialing
4. Closed user group
5. Phone Security
6. Change access codes
press 1 to return to the previous menu
						
  """);
System.out.print("Choose an option: ");
 int securityOptions = scanner.nextInt();
switch (securityOptions) {
case 1-> { 
 System.out.println("Pin Code Request");
boolean pinRequest = true;
while (pinRequest) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
int pinRequests = scanner.nextInt();
 switch (pinRequests) {
case 1->  pinRequest = false;
default-> System.out.println("Choose a valid option");
 }
}
}// end of case for PIN code request

case 2-> { 
System.out.println("Call barring service ");
boolean callBarr = true;
while (callBarr) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
 int callBarrs = scanner.nextInt();
switch (callBarrs) {
case 1->  callBarr = false;
 default-> System.out.println("Choose a valid option");
}
}

}// end of call barring case


case 3-> {
System.out.println("Fixed dialling");
boolean fixDial = true;
while (fixDial) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
int fixDials = scanner.nextInt();
switch (fixDials) {
case 1->  fixDial = false;
default-> System.out.println("Choose a valid option");
}
}
}//fixed dialling case ends
case 4-> {
System.out.println("Closed User groups");
boolean closedUser = true;
while (closedUser) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
 int closedUsers = scanner.nextInt();
  switch (closedUsers) {
case 1->  closedUser = false;
 default-> System.out.println("Choose a valid option");
}
}
	 	
}// End of phone security case

case 5-> {
System.out.println("Phone Security");
boolean inPhoneSec = true;
while (inPhoneSec) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
int inPhoneSecs = scanner.nextInt();
switch (inPhoneSecs) {
case 1->  inPhoneSec = false;
 default-> System.out.println("Choose a valid option");
}
 }
}//end of phone security case
				

case 6-> { 
System.out.println("Change access codes");
boolean accessCode = true;
while (accessCode) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
int accessCodes = scanner.nextInt();
switch (accessCodes) {
case 1->  accessCode = false;
 default-> System.out.println("Choose a valid option");
 }
 }

}// end of change access codes case

case 7-> inSecurity = false;
default-> System.out.println("Choose a valid option");
}
		
}
}// end of case for security settings

case 4-> { 
System.out.println("""
Reset your device to Factory default
Note: Data might be lost.
""");
					
boolean factoryDif = true;
while (factoryDif) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
 int factoryDifs = scanner.nextInt();
switch (factoryDifs) {
case 1->  factoryDif = false;
default-> System.out.println("Choose a valid option");
}
}
}//end of reset to factory default
case 5-> inSettings = false;
default-> System.out.println("Choose a valid option");

 }//end of settings switch 
 }// end of settings while loop
}// end of the settings case
		
case 7-> { 
System.out.println("Call divert");
boolean callDivert = true;
while (callDivert) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
int callDiverts = scanner.nextInt();
switch (callDiverts) {
case 1->  callDivert = false;
default-> System.out.println("Choose a valid option");
 }
}

}// call divert case ends

case 8-> {  
System.out.println("Play Games");
boolean playGame = true;
while (playGame) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
int playGames = scanner.nextInt();
 switch (playGames) {
case 1->  playGame = false;
default -> System.out.println("Choose a valid option");
}
}

}// end of cases for games
		
case 9-> { 
System.out.println("Calculator");
boolean inCalculator = true;
while (inCalculator) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
int inCalculators = scanner.nextInt();
switch (inCalculators) {
case 1->  inCalculator = false;
 default-> System.out.println("Choose a valid option");
}
}
	
}// case ends for calculator
case 10-> { 
 System.out.println("Reminders");
 boolean inReminder = true;
while (inReminder) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
int inReminders = scanner.nextInt();
switch (inReminders) {
case 1->  inReminder = false;
 default-> System.out.println("Choose a valid option");
 }
}
	
 }// Reminder case ends
		
case 11-> { 
  boolean inclock = true;
 while (inclock) {
 System.out.println("""
1. Alarm
2. Clock Setting
3. Date setting
4. Stopwatch
5. Countdown
6. Auto update of date and time
press 7 to return to previous menu
""");
System.out.print("Choose an option: ");
 int clockChoice = scanner.nextInt();
switch (clockChoice) {
case 1-> {
System.out.println("Alarm");
boolean alarmReminder = true;
while (alarmReminder) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
  int alarmReminders = scanner.nextInt();
switch (alarmReminders) {
case 1->  alarmReminder = false;
default-> System.out.println("Choose a valid option");
}
}

}// case for alarm ends
				
case 2-> { 
System.out.println("Set Date");
boolean setDate = true;
while (setDate) {
System.out.println("""
1. Back
""");
System.out.print("Choose an option: ");
 int setDates = scanner.nextInt();
 switch (setDates) {
case 1->  setDate = false;
 default -> System.out.println("Choose a valid option");
}
 }

}// case user setting ends
				
case 3-> {
   System.out.println("Time Manually");
boolean setClock = true;
while (setClock) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
int setClocks = scanner.nextInt();
switch (setClocks) {
case 1->  setClock = false;
 default-> System.out.println("Choose a valid option");
 }
 }

}//Clock setting case end
case 4-> { 
System.out.println("stop watch");
boolean inStopWatch = true;
while (inStopWatch) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
int inStopWatchs = scanner.nextInt();
 switch (inStopWatchs) {
case 1->  inStopWatch = false;
default-> System.out.println("Choose a valid option");
 }
  }
}//end of stopwatch case

case 5-> { 	
 System.out.println("Count down");
boolean inCountDown = true;
while (inCountDown) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
 int inCountDowns = scanner.nextInt();
 switch (inCountDowns) {
case 1->  inCountDown = false;
default-> System.out.println("Choose a valid option");
  }
 }

}// end of countdown case
				
case 6-> { 
System.out.println("Auto update date and time");
boolean autoUpdate = true;
while (autoUpdate) {
System.out.println("""
1. Back
""");

 System.out.print("Choose an option: ");
 int autoUpdates = scanner.nextInt();
switch (autoUpdates) {
case 1->  autoUpdate = false;
 default -> System.out.println("Choose a valid option");
 }
 }
 }// end of date and time update case
case 7-> inclock = false;
default-> System.out.println("Choose a valid option");

}
}
}// case clock ends

case 12-> { 
System.out.println("profiles");
boolean inProfile = true;
while (inProfile) {
System.out.println("""
1. Back
""");

System.out.print("Choose an option: ");
int inProfiles = scanner.nextInt();
switch (inProfiles) {
case 1->  inProfile = false;
 default-> System.out.println("Choose a valid option");
}
}
 
}// profile case ends
		
case 13-> { 
System.out.println("SIM services");
boolean simService = true;
while (simService) {
System.out.println("""
1. Back
	""");

 System.out.print("Choose an option: ");
int simServices = scanner.nextInt();
 switch (simServices) {
case 1->  simService = false;
 default-> System.out.println("Choose a valid option");
 }
 }

}// end of case for sim services

case 14-> { // turn off case
System.out.println("Thank You");
 running = false;
}// turn off case closes
            





 } // main menus switch case ends


} // main menus while loop ends


}
}


