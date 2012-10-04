print "Please enter the dividee "
String str = System.console().readLine()
int i = Integer.parseInt(str)

print "Thank you, now please enter the divider "
String str2 = System.console().readLine()
int j = Integer.parseInt(str2)

int a
int b = -1
int c = 0

while(b == -1){
 if (i - a >= j){
 a = a + j
 c++
 }else{
  if(i != a){
  b = i - a
 }else{ 
 b = 0
 } 
}
}

print i + " divided by "
print j + " is "
print c + " with a remainder of "
print b