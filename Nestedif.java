class Nestedif{
public static void main(String args[]){

String address="Kolkata,India";

if (address.endsWith("India")){

if(address.contains("Delhi")) {
System.out.println("YOur city is Delhi");
}

else if(address.contains("Mumbai")){
System.out.println("YOur city is Mumbai");
}

else{
System.out.println(address.split(",")[0]);
}
}
else{
System.out.println("You are living in India");




}
}

}