import hudson.model.*
String[] programmers = ["Jelena", "Bob", "George", "Jeff", "Roy", "Tom"]
String[] lastname = ["Gajic", "Dylan", "lynne", "Orbison", "Harrison", "Petty"]

String getUserName(String programmers, String lastname){
    return programmers.substring(0,1).toLowerCase() + lastname.substring(0,1).toLowerCase() +  programmers.toLowerCase()
}
assert getUserName("Jelena", "Gajic") == "jgjelena" : "getUsername isn't working"
void printCredential(cred){
    println("Username is ${cred}");
}
for(int i=0; i<programmers.size(); i++){
    printCredential(getUserName(programmers[i], lastname[i]));
}
