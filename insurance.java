class policy
{
 public static void main (String args[])
 {
    shashank sanath rajesh
   String health="excellent";
   String gender="male";
   String location="city";
   int policy=200000,maxvalue=0,age=30;
   int premium=0;
  if((health=="excellent")&&(gender=="male")&&(location=="city")&&(age>=25&&age<=35)&&(policy<=200000))
   premium=4*policy/1000;
  else if((health=="excellent")&&(gender=="female")&&(location=="city")&&(age>=25&&age<=35)&&(policy<=100000))
    premium=3*policy/1000;
  else if((health=="poor")&&(gender=="male")&&(location=="village")&&(age>=25&&age<=35)&&(policy<=10000))
     premium=6*policy/1000;
  else
   System.out.println("not secured");
 System.out.println(premium);
 maxvalue=premium+policy;
 System.out.println(maxvalue);
 }
}