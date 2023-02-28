package org.example;

class Node{

    Node nextNode=null;
    public String personname;
    public long phonenumber;
    public String emailid;
    Node(String name,long number,String email){
        this.personname= name;
        this.phonenumber=number;
        this.emailid=email;
    }
}