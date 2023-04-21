package com.bldea.crorepathiapp.package1;

import java.util.Scanner;

public class CrorepathiApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO CROREPATHI ");
		System.out.println("LETS WELCOME OUR FIRST CANDIDATE");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("WHAT IS YOUR NAME?");
		String name =sc.next();
		System.out.println("WHAT IS YOUR AGE?");
		int age = sc.nextInt();
		System.out.println("WHAT IS YOUR CITY?");
		String city =sc.next();
		System.out.println("WHAT IS YOUR STATE?");
		String state =sc.next();
		
		Candidate c1=new Candidate(name, age, city, state);
		System.out.println("CONGRATULATIONS FOR MAKING IT TILL HERE Mr/Mrs."+c1.getName());
		
		System.out.println("THE RULES OF THE GAME.");
		System.out.println("1.THERE WILL BE 10 QUESTIONS WHICH REWARDS A SPECIFIC AMOUNT IN AN INCREMENTAL ORDER.");
		System.out.println("2.THE GAME will CONTAIN 3 LIFE LINES."
				+"AUDIANCE POLL, 50-50 & / SKIP THE QUESTION, DIRECTLY GO TO LAST QUESTION");
		System.out.println("3.YOU CAN QUITE THE GAME AT ANY STAGE");
		
		System.out.println(" PLEASE TYPE 1 IF U WISH TO SEE THE REWARD PER QUESTION"
				+"ELSE TYPE ANY KEY.");
		int type_1 =sc.nextInt();
		if(type_1==1) {
			System.out.println("QUESTION-1  : 1000\n"
					+ "QUESTION-2  : 5000\n"
					+ "QUESTION-3  : 10000\n"
					+ "QUESTION-4  : 50000\n"
					+ "QUESTION-5  : 300000\n"
					+ "QUESTION-6  : 600000\n"
					+ "QUESTION-7  : 1200000\n"
					+ "QUESTION-8  : 2500000\n"
					+ "QUESTION-9  : 5000000\n"
					+ "QUESTION-10 : 10000000\n");
			System.out.println("DO YOU WISH TO CONTINUE? (TYPE: YES/NO)");
		}
		else {
			System.out.println("DO YOU WISH TO CONTINUE? (TYPE: YES/NO)"); }
			String type_2 =sc.next();
			if (type_2.equalsIgnoreCase("yes")==true) {
				System.out.println("LETS BEGIN THE GAME");
				System.out.println("HERE IS THE FIRST QUESTION");
				boolean res1 = Questions.fetchQuestion1(c1.getName());
				if(res1==true) {
					System.out.println("congratulations!! your answer is correct.\n"
							+"you have won Rs"+c1.getAmount());
				
					System.out.println("HERE IS THE next QUESTION");
					boolean res2 = Questions.fetchQuestion2(c1.getName());
					if(res2==true) {
						System.out.println("congratulations!! your answer is correct.\n"
								+"you have won Rs"+c1.getAmount());
						
						System.out.println("HERE IS THE next QUESTION");
						boolean res3 = Questions.fetchQuestion3(c1.getName());
						if(res3==true) {
							System.out.println("congratulations!! your answer is correct.\n"
									+"you have won Rs"+c1.getAmount());
							
							System.out.println("HERE IS THE next QUESTION");
							boolean res4 = Questions.fetchQuestion4(c1.getName());
							if(res4==true) {
								System.out.println("congratulations!! your answer is correct.\n"
										+"you have won Rs"+c1.getAmount());
							
								System.out.println("HERE IS THE next QUESTION");
								boolean res5 = Questions.fetchQuestion5(c1.getName());
								if(res5==true) {
									System.out.println("congratulations!! your answer is correct.\n"
											+"you have won Rs"+c1.getAmount());
									
									System.out.println("HERE IS THE next QUESTION");
									boolean res6 = Questions.fetchQuestion6(c1.getName());
									if(res6==true) {
										System.out.println("congratulations!! your answer is correct.\n"
												+"you have won Rs"+c1.getAmount());
										
										
										System.out.println("HERE IS THE next QUESTION");
										boolean res7 = Questions.fetchQuestion7(c1.getName());
										if(res7==true) {
											System.out.println("congratulations!! your answer is correct.\n"
													+"you have won Rs"+c1.getAmount());
											
											System.out.println("HERE IS THE next QUESTION");
											boolean res8 = Questions.fetchQuestion8(c1.getName());
											if(res8==true) {
												System.out.println("congratulations!! your answer is correct.\n"
														+"you have won Rs"+c1.getAmount());
												
												
												System.out.println("HERE IS THE next QUESTION");
												boolean res9 = Questions.fetchQuestion9(c1.getName());
												if(res9==true) {
													System.out.println("congratulations!! your answer is correct.\n"
															+"you have won Rs"+c1.getAmount());
													
													System.out.println("HERE IS THE next QUESTION");
													boolean res10 = Questions.fetchQuestion10(c1.getName());
													if(res10==true) {
														System.out.println("congratulations!! your answer is correct.\n"
																+"you have won Rs"+c1.getAmount());
														
														
														
													}
													else {
														System.out.println("sorry your answer is incorrect.\n"
																+"you have won Rs"+c1.getAmount());
													}
													
												}
												else {
													System.out.println("sorry your answer is incorrect.\n"
															+"you have won Rs"+c1.getAmount());
												}
											}
											else {
												System.out.println("sorry your answer is incorrect.\n"
														+"you have won Rs"+c1.getAmount());
											}
											
										}
										else {
											System.out.println("sorry your answer is incorrect.\n"
													+"you have won Rs"+c1.getAmount());
										}
										
									}
									else {
										System.out.println("sorry your answer is incorrect.\n"
												+"you have won Rs"+c1.getAmount());
									}
									
								}
								else {
									System.out.println("sorry your answer is incorrect.\n"
											+"you have won Rs"+c1.getAmount());
								}
								
							}
							else {
								System.out.println("sorry your answer is incorrect.\n"
										+"you have won Rs"+c1.getAmount());
							}	
						}
						else {
							System.out.println("sorry your answer is incorrect.\n"
									+"you have won Rs"+c1.getAmount());
						}
						
					}
					else {
						System.out.println("sorry your answer is incorrect.\n"
								+"you have won Rs"+c1.getAmount());
					}
					
					
				}
				else {
					System.out.println("sorry your answer is incorrect.\n"
							+"you have won Rs"+c1.getAmount());
				}
			}
			
			else {
				System.out.println("THANKYOU FOR COMING. ALL THE BEST");
			}
			
		}
		
	

}
