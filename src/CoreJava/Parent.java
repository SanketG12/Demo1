package CoreJava;

public class  Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public void TMobile() {
		System.out.println("I am Tmobile employee");
		
	}

	
	public void Verizon() {
		System.out.println("I am Verizon employee");
		
	}
	//using super keyword
	
	 public void getdata() {
			System.out.println("i am parent getdata method");
			
		}
	 //Protected mode uses in other package
	 protected void getdata1() {
			System.out.println("i am parent protected getdata method");
			
		}
	 String name ="Sanket";
}

//I was working with the client ATT US , whose having its business in telecom domain. Which basically deals with the product like Wireless,wireline and Uverse . ATT having its online application where new customer can go to website and place their order for the product. Also existing customers can login into website and check their product details like usages,billing, paymnet also they can upgrade, modify and place new orders for the product.
//
//I was the part of Myatt project where i was working in wireless area and sometimes have to work on Uverse part as well. In this project we get the user stories, based on this we have to write the test cases and do test plannig. Where its first goes for approval and once its get apporved we get this test cases in the form of tickets in one of the tool called as One Data Tool. After that we Procure data as mentioned in tickets. There are so many backends to which data needs to flow. Then we perform database testing/validation on created data to check whether this data flowing through all respective backeneds or not to ensure that all the functionality of data is properly working and visible on front end. Once all this done we provide this data in tickets and close that. After that on the same data we perform Functional testing/system testing and regression testing. For Regression testing we used to run automation scripts so that we can complete exucation fastly. For System Testing we used to do manual testing, because in this we are just testing newly added functionality so it is better to do manually.
//
//After that i moved to MyattSales where i was working with Amdocs testing team. Here we are procuring data and doing database testing/validation and providing data to amdocs testing team.
//
//==================== There is UAT team whose having some of the same scenarios as we have, so they just check thier tickets with our tickets if its match, they check wheter provided data is reusable or not like volatile or non-volatile. So they use the reusable data for some scenarios and for remaing they raise tickets and we provide data to them.