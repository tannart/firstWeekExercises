int a
int b
int c
int d
int e
int card1
int card2
int card3
int card4
int card5
int pairs
int house
int twoPair
int consecutive

println "Please enter a card number or letter: "
String str = System.console().readLine()
if(str == "J"){
  a = 11
} else if(str == "Q"){
  a = 12
} else if(str == "K"){
  a = 13
} else {
  a = Integer.parseInt(str)
}

println "and now please enter a suit: "
str = System.console().readLine()
if(str == "hearts"||str == "Hearts"){
 card1 = 1
} else if(str == "spades" || str == "Hearts"){
 card1 = 2
} else if(str == "diamonds" || str == "Diamonds"){
 card1 = 3
} else if(str == "clubs" || str == "Clubs"){
 card1 = 4
}

println "Please enter a card number or letter: "
str = System.console().readLine()
if(str == "J"){
  b = 11
} else if(str == "Q"){
  b = 12
} else if(str == "K"){
  b = 13
} else {
  b = Integer.parseInt(str)
}

if(a == b){
 pairs = pairs + 1
} else if(a == b+1 || a == b-1){
 consecutive = consecutive + 1
}
   
println "and now please enter a suit: "
str = System.console().readLine()
if(str == "hearts"||str == "Hearts"){
 card2 = 1
} else if(str == "spades" || str == "Hearts"){
 card2 = 2
} else if(str == "diamonds" || str == "Diamonds"){
 card2 = 3
} else if(str == "clubs" || str == "Clubs"){
 card2 = 4
}


println "Please enter a card number or letter: "
str = System.console().readLine()
if(str == "J"){
  c = 11
} else if(str == "Q"){
  c = 12
} else if(str == "K"){
  c = 13
} else {
  c = Integer.parseInt(str)
}

if(a == c || b == c){
 pairs = pairs + 1
 if(c!=a && c!=b){
  twoPair = c
} else if(a == c+1 || a == c-1 || b == c+1 || b == c-1){
 consecutive = consecutive + 1 
}

println "and now please enter a suit: "
str = System.console().readLine()
if(str == "hearts"||str == "Hearts"){
 card3 = 1
} else if(str == "spades" || str == "Hearts"){
 card3 = 2
} else if(str == "diamonds" || str == "Diamonds"){
 card3 = 3
} else if(str == "clubs" || str == "Clubs"){
 card3 = 4
}

println "Please enter a card number or letter: "
str = System.console().readLine()
if(str == "J"){
  d = 11
} else if(str == "Q"){
  d = 12
} else if(str == "K"){
  d = 13
} else {
  d = Integer.parseInt(str)
}

if(a == d || b == d || c == d){
 pairs = pairs + 1
  if(d!=a && d!=b && d!=c){
   if(d == twoPair){
    house = house + 1
    }
   }
} else if(a == d+1 || a == d-1 || b == d+1 || b == d-1 || c == d+1 || c == d-1){
 consecutive = consecutive + 1
} 

println "and now please enter a suit: "
str = System.console().readLine()
if(str == "hearts"||str == "Hearts"){
 card4 = 1
} else if(str == "spades" || str == "Hearts"){
 card4 = 2
} else if(str == "diamonds" || str == "Diamonds"){
 card4 = 3
} else if(str == "clubs" || str == "Clubs"){
 card4 = 4
}


println "Please enter a card number or letter: "
str = System.console().readLine()
if(str == "J"){
  e = 11
} else if(str == "Q"){
  e = 12
} else if(str == "K"){
  e = 13
} else {
  e = Integer.parseInt(str)
}

if(a == e || b == e || c == e || d == e){
 pairs = pairs + 1
 if(a!=d && a!=b && a!=c){
   if(d == twoPair){
    house = house + 1
    }
   }
} else if(a == e+1 || a == e-1 || b == e+1 || b == e-1 || c == e+1 || a == e-1 || d == e+1 || d == e-1){
 consecutive = consecutive + 1
}

println "and now please enter a suit: "
str = System.console().readLine()
if(str == "hearts"||str == "Hearts"){
 card5 = 1
} else if(str == "spades" || str == "Hearts"){
 card5 = 2
} else if(str == "diamonds" || str == "Diamonds"){
 card5 = 3
} else if(str == "clubs" || str == "Clubs"){
 card5 = 4
}

if(consecutive == 4 && card1 == card2 && card3 == card4 && card1 == card5){
 println "Way to go man! You totally got a Straight Flush! THATS THE BEST HAND IN THE GAME!!!!"
} else if(card1 == card2 && card3 == card4 && card1 == card5 ){
println "You have a flush!"
} else if(consecutive == 4){
 println "Way to go man! You totally got a Straight!"
} else if(pairs == 1){
 print "congrats, you got a pair"
} else if(pairs == 2){
 print "well done, you got three of a kind"
} else if(pairs == 3){
 print "Unbelievable, You got a four of a kind!"
} else if(pairs == 4){
 print "Nice try, you are clearly cheating, you will now be ejected from the hotel"
} else {
 print "Sorry chachi, no dice."
}

