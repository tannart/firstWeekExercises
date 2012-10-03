print "Please enter a number: "
String str = System.console().readLine()
int i = Integer.parseInt(str)

print "Thank you, now please enter another: "
String str2 = System.console().readLine()
int j = Integer.parseInt(str2)

print "Thank you, now a final number: "
String str3 = System.console().readLine()
int k = Integer.parseInt(str3)

int n = 0
int m = 0

while (m < 3){
 if(n == j){
 println j
 m ++
 }
 if(n == k){
 println k
 m++
 }
 if(n == i){
 println i
 m++
 }
 n++
}