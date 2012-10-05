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
int pairsCounter
int twoPairsCounter
int threePairsCounter
int fourPairsCounter
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
 
pairsCounter = 1

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
 pairsCounter += 1
} else { 
 twoPairsCounter +=1
}

if(a == b+1 || a == b-1){
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

if(a == c){
 pairsCounter += 1
} else if(b == c){
 twopairsCounter +=1
} else{
 threePairsCounter +=1
}

if(a == c+1 || a == c-1 || b == c+1 || b == c-1){
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

if(a == d){
 pairsCounter += 1
} else if(b == d){
 twoPairsCounter += 1
} else if(c == d){
 threePairsCounter += 1
} else{
 fourPairsCounter +=1
}

if(a == d+1 || a == d-1 || b == d+1 || b == d-1 || c == d+1 || c == d-1){
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

if(a == e){
 pairsCounter +=1
} else if(b == e){
 twoPairsCounter +=1
} else if(c == e){
 threePairsCounter +=1
} else if(d == e){
 fourPairsCounter += 1
}

if(a == e+1 || a == e-1 || b == e+1 || b == e-1 || c == e+1 || a == e-1 || d == e+1 || d == e-1){
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
println pairsCounter
println twoPairsCounter
println threePairsCounter
println fourPairsCounter

if(consecutive == 4 && card1 == card2 && card3 == card4 && card1 == card5){
 println "Way to go man! You totally got a Straight Flush! THATS THE BEST HAND IN THE GAME!!!!"
} else if((pairsCounter + twoPairsCounter == 3) || (pairsCounter + threePairsCounter == 3) || (pairsCounter + fourPairsCounter == 3) || (twoPairsCounter + threePairsCounter == 3) || (twoPairsCounter + fourPairsCounter == 3) || (threePairsCounter + fourPairsCounter ==3)){
 println "Full House"
} else if(card1 == card2 && card3 == card4 && card1 == card5 && card1 == card3){
 println "You have a flush!"
} else if(consecutive == 4){
 println "Way to go man! You totally got a Straight!"
} else if(pairsCounter == 4 || twoPairsCounter == 4){
 println "Four of a Kind"
} else if(pairsCounter == 3 || twoPairsCounter == 3 || threePairsCounter == 3 || fourPairsCounter == 3){
 println "Three of a Kind"
} else if((pairsCounter + twoPairsCounter == 2) || (pairsCounter + threePairsCounter == 2) || (pairsCounter + fourPairsCounter == 2) || (twoPairsCounter + threePairsCounter == 2) || (twoPairsCounter + fourPairsCounter == 2) || (threePairsCounter + fourPairsCounter ==2)){
 println "you have a two pair"
} else if(pairsCounter == 2 || twoPairsCounter == 2 || threePairsCounter == 2 || fourPairsCounter == 2){
 println "Pair"
} else if(pairsCounter == 5 || twoPairsCounter == 5 || threePairsCounter == 5 || fourPairsCounter == 5){
 println "Nice try, you are clearly cheating, you will now be ejected from the hotel"
} else {
 println "Sorry chachi, no dice."
}