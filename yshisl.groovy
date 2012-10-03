boolean yes = true

print "Please enter a number "
String str = System.console().readLine()
int i = Integer.parseInt(str)
int a = i
int b = i

  while(i != -1){
   a = i
   if(a != b+1 && a != b-1 && a != b){
    yes = false
    }
   b=i
   print "Please enter another number "
   str = System.console().readLine()
   i = Integer.parseInt(str)
}

if(yes == true){
 print "yes"
 }else{
 print "no"
}
// This is an arbitrary comment which I'm adding