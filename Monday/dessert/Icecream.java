package Monday;


	public class Icecream extends dessert{
		   private  int noOfIceCreams=0;
			@Override
			public double getcost(int num) {
				double amount=num*15;
				double tax=amount*0.1;
				  amount+=tax;
				return amount;
				// TODO Auto-generated method stub
				
			}

			public void addIceCream(int num) {
				// TODO Auto-generated method stub
				this.noOfIceCreams+=num;
			}

			public void addIceCreamToCart(int num) {
				// TODO Auto-generated method stub
				if(num>this.noOfIceCreams){
					System.out.println("There is only "+this.noOfIceCreams+" Ice Creams");
					
				}
				else {
					this.noOfIceCreams-=num;
					
				}
			}

		}

