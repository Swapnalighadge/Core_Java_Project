package CoreJava;

import java.util.*;

class nopay
{
public static void nopay()
{
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
System.out.println("We Feel Very Unfortunate That We Were Unable To ProvideYou With The Product You Were Looking For.");
System.out.println("Thank You For Your Time, Have a Nice Day!");
System.out.println("....................................................................................................");
}
}
class payment
{
static
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("");
System.out.println("$$ PAY HERE $$");
System.out.println("");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}
public static void payment()
{
System.out.println("How Would You LIke To Pay");
System.out.println("-------------------------------------------------------------------------------------------");
System.out.println("1. Cash");
System.out.println("2. Debit / Credit Card");
System.out.println("3. UPI / GPAY / PHONEPE");
payment2();
}
public static void payment2()
{
System.out.println("Enter the no.:- ");
Scanner S=new Scanner(System.in);
int a= S.nextInt();
if(a>0&&a<4) {
switch (a) {
case 1:
thankyou();
break;
case 2:

debitcard();
break;
case 3:
upi();
break;
}
}
else
{
System.out.println("********************************INVALID INPUT****************************************");
System.out.println("Try Again!");
System.out.println(" ");
payment();
}
}
public static void upi()
{
System.out.println("ENTER UPI ID:-");
Scanner S=new Scanner(System.in);
String a=S.nextLine();
card();
}
public static void debitcard()
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Kindly Enter Your Credit/Debit Card No.:");
System.out.println("Note:- Card No. Format: 'XXXX-XXXX-XXXX-XXXX' ");
Scanner S=new Scanner(System.in);
String a=S.nextLine();
if(a.matches("[0-9]{4}[-]{1}[0-9]{4}[-]{1}[0-9]{4}[-]{1}[0-9]{4}"))
{
cardDate();
}
else
{
System.out.println("****************************************INVALID INPUT****************************************");
System.out.println("Try Again!");
System.out.println(" ");
debitcard();
}
}
public static void cardDate()
{
System.out.println("Kindly Enter Your Credit/Debit Expiry Date :");
System.out.println("Note:- Card Date Format: XX/XX ");
System.out.println("-------------------------------------------------------------------------------------------------");
Scanner S=new Scanner(System.in);

String a=S.nextLine();
if(a.matches("[0-9]{2}[/]{1}[0-9]{2}"))
{
card();
}
else
{
System.out.println("******************************************INVALID INPUT****************************************");
System.out.println("Try Again!");
System.out.println(" ");
cardDate();
}
}
public static void card()
{
Scanner S=new Scanner(System.in);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Enter Your 4-Digit Pin:-");
long a=S.nextLong();
if(a<9999&&a>1111)
{
thankyou();
}
else
{
System.out.println("***************************************INVALID INPUT*********************************************");
System.out.println("Try Again!");
card();
}
}
public static void thankyou()
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Transaction Is Completed, Here's Your Product Hope It Accompany's You In All The New Moments You Are About To Create.");
System.out.println("Thank You For Your Time, Have a Nice Day!!!!!!!");
System.out.println("......................................................................................................................");
}
}
class customerDetail
//ENCAPSULATION
{
private String cname;
private String cnumber;
private String cmailid;

public String getCname()
{
return cname;
}
//GETTER METHOD
public String getCnumber()
{
return cnumber;
}
//GETTER METHOD
public String getCmailid()
{
return cmailid;
}
//GETTER METHOD
public void setCname(String cname)
{
this.cname=cname;
}
//SETTER METHOD
public void setCnumber(String cnumber)
{
this.cnumber=cnumber;
}
//SETTER METHOD
public void setCmailid(String cmailid)
{
this.cmailid=cmailid;
}
//SETTER METHOD
}
class consumer
{
public static void consumer1()
{
customerDetail cd=new customerDetail();
Scanner S=new Scanner(System.in);
System.out.println("Please enter your details has per requirement:- ");
System.out.println("Enter Your Name:-");
cd.setCname(S.nextLine());
System.out.println("Enter Your Mail Id:-");
cd.setCmailid(S.nextLine());
System.out.println("Enter Your Phone Number:-");
String num=S.nextLine();
if(num.matches("[0-9]{10}"))
//REGEX
{
cd.setCnumber(num);
System.out.println("check the following details");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println(cd.getCname());
System.out.println(cd.getCnumber());
System.out.println(cd.getCmailid());
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("");
}

else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("TryAgain?");
consumer1();
}
AbsoluteGlamm.cosmo();
}
}
public class AbsoluteGlamm {
static String price;
static
{
System.out.println("=========================================================================================================");
System.out.println("");
System.out.println("***************************************** Welcome to AbsoluteGlamm ****************************************");
System.out.println("");
System.out.println("=========================================================================================================");
System.out.println("I hope you are here to purchase a few Beauty Products.");
System.out.println("Here are the option we can provide please select accordingly");
}
public static void cosmo()
{
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Press and Enter the no. respective to the Product you would like to purchase");
System.out.println("1. skincare");
System.out.println("2. makeup");
System.out.println("3. haircare");
System.out.println("--------------------------------------------------------------------------------------------------------");
cosmo2();
}
public static void cosmo2()
{
System.out.println("Enter the no.:- ");
Scanner S=new Scanner(System.in);
int a= S.nextInt();
if(a>=1 && a<=6)
{
switch (a) {
case 1 : skincare.skincare();
break;

case 2 : makeup.makeup();
break;
case 3 : haircare.haircare();
break;

}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
cosmo();
}
}
public static void main(String[] args)
{
consumer.consumer1();
}
}
class skincare extends AbsoluteGlamm
{
static
{
System.out.println("========================================================================================================");
System.out.println("OKAY, looks like we have narrowed it down to skincarelet dig deep then are you ready!!!!");
}
public static void skincare2()
{
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Please Select From This Types Available");
System.out.println("1. Facewash");
System.out.println("2. Mosturiser");
System.out.println("3. Sunscreen");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Enter The No. Respective To The Product which you want");
skincare3();
}
public static void skincare3()
{
Scanner S=new Scanner(System.in);
int a= S.nextInt();
if(a==1||a==2||a==3)
{
switch (a) {

case 1:
Facewh.Facewh();
break;
case 2:
Most.Most();
break;
case 3:
AbsoluteGlamm.cosmo();
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
skincare2();
}
}
public static void skincare()
{
skincare2();
skincare3();
}
}
class makeup extends AbsoluteGlamm {
static{
System.out.println("==========================================================================================================");
System.out.println("OKAY, looks like we have narrowed it down to makeup let dig deep then are you ready!!!");
System.out.println("");
}
public static void makeup2()
{
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Please Select From This Types Available");
System.out.println("1. Lipstick");
System.out.println("2. Compact");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Enter The No. Respective To The Type of Product Of Your Choice");
makeup3();
}
public static void makeup() {
// TODO Auto-generated method stub
}
public static void makeup3()
{
Scanner S = new Scanner(System.in);
int a = S.nextInt();

if(a==1||a==2||a==3)
{
switch (a)
{
case 1:
Lips.Lips();
break;
case 2:
Comp. Comp();
break;
case 3:
AbsoluteGlamm.cosmo();
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
makeup2();
}
}
}
class haircare extends AbsoluteGlamm
{
static
{
System.out.println("=========================================================================================");
System.out.println("OKAY, looks like we have narrowed it down to haircare let dig deep then are you ready!!!!");
System.out.println("");
}
public static void haircare2()
{
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Please Select From This types of product Available");
System.out.println("1. Shampoo");
System.out.println("2. Oil");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Enter The No. Respective To The types of product Your Choice");
haircare3();
}
public static void haircare() {
// TODO Auto-generated method stub
}

public static void haircare3()
{
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a==1||a==2||a==3)
{
switch (a) {
case 1:
Shamp.Shamp();
break;
case 2:
Oil.Oil();
break;
case 3: AbsoluteGlamm.cosmo();
}
}
else
{
System.out.println("*******************************************INVALID INPUT***********************************************");
haircare2();
}
}
}
class Facewh extends skincare
{
static
{
System.out.println("You Have Selected Facewash");
}
public static void Facewh()
{
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Here Are The Product That Are Available At The Moment:-");
System.out.println("1. Mamaearth ");
System.out.println("2. Himalaya");
System.out.println("3. Garnier");
System.out.println("4. Nivea");
System.out.println("5. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Enter The No. Respective To The Product To See The Specification");
Facewh1();
}
public static void Facewh1()
{
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<6)
{
switch (a) {

case 1: Mamaearth.Mamaearth();
break;
case 2: Himalaya.Himalaya() ;
break;
case 3:
Garnier.Garnier() ;
break;
case 4:
Nivea.Nivea() ;
break;
case 5: skincare.skincare();
break;
}
}
else
{
System.out.println("*****************************************INVALID INPUT*************************************************");
System.out.println("Try Again");
Facewh();
}
}
}
class Mamaearth extends Facewh
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Mamaearth");
}
public static void Mamaearth()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Mamaearth a=new Mamaearth("₹430/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();

break;
case 2:
nopay.nopay();
break;
case 3:
Facewh.Facewh();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("TryAgain");
buy();
}
}
Mamaearth(String price)
{
this.price=price;
}
}
class Himalaya extends Facewh
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Himalaya");
}
public static void Himalaya ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Himalaya a=new Himalaya ("₹130/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {

switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Facewh.Facewh();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Himalaya (String price)
{
this.price=price;
}
}
class Garnier extends Facewh
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Garnier ");
}
public static void Garnier ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Garnier a=new Garnier("₹370/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Facewh.Facewh();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Garnier (String price)
{
this.price=price;
}
}
class Nivea extends Facewh
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Nivea");
}
public static void Nivea()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Nivea a=new Nivea("₹370/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");

System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Facewh.Facewh();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Nivea(String price)
{
this.price=price;
}
}
class Most extends skincare
{
static
{
System.out.println("You Have Selected Mosturiser");
}
public static void Most()
{
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Here Are The Product That Are Available At The Moment:-");
System.out.println("1. Lotus ");
System.out.println("2. Biotique");
System.out.println("3. Lackme");
System.out.println("5. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Enter The No. Respective To The Product To See The Specification");
Most1();
}

public static void Most1()
{
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<6)
{
switch (a) {
case 1: Lotus.Lotus();
break;
case 2: Biotique.Biotique() ;
break;
case 3:
Garnier.Garnier() ;
break;
case 4:
Lackme.Lackme() ;
break;
case 5: skincare.skincare();
break;
}
}
else
{
System.out.println("*****************************************INVALID INPUT*************************************************");
System.out.println("Try Again");
Most();
}
}
}
class Lotus extends Most
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Lotus");
}
public static void Lotus()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Lotus a=new Lotus("₹430/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");

System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Most. Most();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Lotus(String price)
{
this.price=price;
}
}
class Biotique extends Most
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Biotique");
}
public static void Biotique()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Biotique a=new Biotique ("₹130/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");

System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Most.Most();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Biotique (String price)
{
this.price=price;
}
}
class Lackme extends Most
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Lackme");
}
public static void Lackme ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Lackme a=new Lackme("₹370/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()

{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Most.Most();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Lackme (String price)
{
this.price=price;
}
}
class Sunsc extends skincare
{
static
{
System.out.println("You Have Selected Sunscreen");
}
public static void Sunsc()
{
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Here Are The Product That Are Available At The Moment:-");
System.out.println("1. Tac");
System.out.println("2.Iba");
System.out.println("3. ISDIN");
System.out.println("5. Go Back");

System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Enter The No. Respective To The Product To See The Specification");
Sunsc1();
}
public static void Sunsc1()
{
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<6)
{
switch (a) {
case 1: Tac.Tac();
break;
case 2: Iba.Iba() ;
break;
case 3:
ISDIN.ISDIN() ;
break;
case 4: skincare.skincare();
break;
}
}
else
{
System.out.println("*****************************************INVALID INPUT*************************************************");
System.out.println("Try Again");
Sunsc();
}
}
}
class Tac extends Sunsc
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Tac");
}
public static void Tac()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Tac a=new Tac("₹430/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");

System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Sunsc.Sunsc();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Tac(String price)
{
this.price=price;
}
}
class Iba extends Sunsc
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Iba");
}
public static void Iba ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Iba a=new Iba ("₹130/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();

}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Sunsc.Sunsc();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Iba (String price)
{
this.price=price;
}
}
class ISDIN extends Sunsc
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected ISDIN");
}
public static void
ISDIN ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
ISDIN a=new ISDIN("₹370/-");

System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Sunsc.Sunsc();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");

buy();
}
}
ISDIN (String price)
{
this.price=price;
}
}
class Lips extends makeup
{
static
{
System.out.println("You Have Selected Makeup");
}
public static void Lips()
{
System.out.println("--------------------------------------------------------------------------------------------------------");

System.out.println("Here Are The Product That Are Available At The Moment:-");
System.out.println("1. Mac");
System.out.println("2.Elle");
System.out.println("3. Sugar");
System.out.println("5. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Enter The No. Respective To The Product To See The Specification");
makeup1();
}
public static void makeup1()
{
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<6)
{
switch (a) {
case 1: MAC.MAC();
break;
case 2: ELLE.ELLE() ;
break;
case 3:
SUGAR.SUGAR() ;
break;
case 4: Lips.Lips();
break;
}
}
else
{
System.out.println("*****************************************INVALID INPUT*************************************************");
System.out.println("Try Again");
Lips();
}
}
}
class MAC extends Lips
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Mac");
}
public static void MAC()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
MAC a=new MAC ("₹430/-");
System.out.println("Price:- "+price);

System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Lips.Lips();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
MAC (String price)
{
this.price=price;
}
}
class ELLE extends Lips
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected ELLE ");
}
public static void ELLE ()
{

System.out.println(" ");
System.out.println("Here Are Its Specification");
ELLE a=new
ELLE ("₹130/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Lips.Lips();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
ELLE(String price)
{
this.price=price;

}
}
class SUGAR extends Lips
{
static
{
System.out.println("*******************************************************************************************************");

System.out.println("You Have Selected Sugar");
}
public static void SUGAR ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
SUGAR a=new SUGAR("₹370/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Lips.Lips();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
SUGAR (String price)
{
this.price=price;
}
}
class Comp extends makeup
{
static



{
System.out.println("You Have Selected Compact");
}
public static void Comp ()
{
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Here Are The Product That Are Available At The Moment:-");
System.out.println("1. Canada");
System.out.println("2. Swiss");
System.out.println("3. Huda");
System.out.println("5. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Enter The No. Respective To The Product To See The Specification");
makeup1();
}
public static void makeup1()
{
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<6)
{
switch (a) {
case 1: Canada.Canada();
break;
case 2: Swiss.Swiss() ;
break;
case 3:
Huda.Huda() ;
break;
case 4: Comp.Comp ();
break;
}
}
else
{
System.out.println("*****************************************INVALID INPUT*************************************************");
System.out.println("Try Again");
Comp ();
}
}
}
class Canada extends Comp
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Canada");
}

public static void Canada ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Canada
a=new
Canada ("₹430/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Comp .Comp ();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Canada (String price)
{
this.price=price;
}
}
class Swiss extends Comp
{
static
{

System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Swiss");
}
public static void Swiss ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Swiss a=new Swiss ("₹130/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Comp .Comp ();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Swiss(String price)
{
this.price=price;
}
}


class Huda extends Comp
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Huda");
}
public static void Huda ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Huda
a=new Huda ("₹370/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Comp .Comp ();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Huda (String price)


{
this.price=price;
}
}
class Shamp extends haircare
{
static
{
System.out.println("You Have Selected Haircare");
}
public static void Shamp()
{
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Here Are The Product That Are Available At The Moment:-");
System.out.println("1. Loreal");
System.out.println("2. Streax");
System.out.println("3. Matrix");
System.out.println("5. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Enter The No. Respective To The Product To See The Specification");
haircare1();
}
public static void haircare1()
{
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<6)
{
switch (a) {
case 1: Loreal.Loreal();
break;
case 2: Streax. Streax() ;
break;
case 3:
Matrix.Matrix() ;
break;
case 4: Shamp.Shamp();
break;
}
}
else
{
System.out.println("*****************************************INVALID INPUT*************************************************");
System.out.println("Try Again");
Shamp();
}
}
}
class Loreal extends Shamp

{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Loreal");
}
public static void Loreal ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Loreal a=new Loreal ("₹430/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Shamp.Shamp();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Loreal (String price)
{
this.price=price;
}
}
class Streax extends Shamp
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Streax");
}
public static void Streax ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Streax a=new
Streax ("₹130/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Shamp.Shamp();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Streax(String price)
{
this.price=price;
}
}
class Matrix extends Shamp
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Matrix");
}
public static void
Matrix ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Matrix a=new
Matrix("₹370/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Shamp.Shamp();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");

System.out.println("Try Again");
buy();
}
}
Matrix (String price)
{
this.price=price;
}
}
class Oil extends haircare
{
static
{
System.out.println("You Have Selected Oil");
}
public static void Oil ()
{
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Here Are The Product That Are Available At The Moment:-");
System.out.println("1. Wow");
System.out.println("2. Bajaj");
System.out.println("3. Kama");
System.out.println("5. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println("Enter The No. Respective To The Product To See The Specification");
haircare1();
}
public static void haircare1()
{
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<6)
{
switch (a) {
case 1: Wow.Wow();
break;
case 2: Bajaj.Bajaj() ;
break;
case 3:
Kama.Kama() ;
break;
case 4: Oil.Oil ();
break;
}
}
else
{
System.out.println("*****************************************INVALID INPUT*************************************************");
System.out.println("Try Again");
Oil ();
}
}
}
class Wow extends Oil
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Wow");
}
public static void
Wow ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Wow a=new
Wow ("₹430/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Oil .Oil ();
break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");


buy();
}
}
Wow (String price)
{
this.price=price;
}
}
class Bajaj extends Oil
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Bajaj");
}
public static void Bajaj ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Bajaj a=new
Bajaj ("₹130/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Oil.Oil ();
break;
}
}
else
{

System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Bajaj(String price)
{
this.price=price;


}
}
class Kama extends Oil
{
static
{
System.out.println("*******************************************************************************************************");
System.out.println("You Have Selected Kama");
}
public static void Kama ()
{
System.out.println(" ");
System.out.println("Here Are Its Specification");
Kama a=new Kama ("₹370/-");
System.out.println("Price:- "+price);
System.out.println("--------------------------------------------------------------------------------------------------------");
buy();
}
public static void buy()
{
System.out.println(" ");
System.out.println("Would You like To Buy This Product");
System.out.println("1. YES");
System.out.println("2. NO");
System.out.println("3. Go Back");
System.out.println("--------------------------------------------------------------------------------------------------------");
Scanner S = new Scanner(System.in);
int a = S.nextInt();
if(a>=1&&a<4) {
switch (a) {
case 1:
payment.payment();
break;
case 2:
nopay.nopay();
break;
case 3:
Oil .Oil();

break;
}
}
else
{
System.out.println("******************************************INVALID INPUT*******************************************");
System.out.println("Try Again");
buy();
}
}
Kama (String price)
{
this.price=price;
}
}

