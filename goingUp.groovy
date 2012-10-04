boolean yes = true
int b

print "Please enter a number "
String str = System.console().readLine()
int i = Integer.parseInt(str)
int a = i

while(i != -1){
 if(i != a){
  yes = false
 }
 print "Please enter another number "
 str = System.console().readLine()
 i = Integer.parseInt(str)
 a++
}

if(yes == true){
 print "yes"
 }else{
 print "no"
}