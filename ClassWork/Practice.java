long startTime = System.currentTimeMills() % 10;
long endTime = System.currentTimeMills() / 7 % 10;

long duration = endTime - startTime;

System.out.println("Duration: " + duration + "milliseconds")

