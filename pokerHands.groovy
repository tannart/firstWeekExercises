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
String str = System.console().readLine()
if(str == "J"){
  b = 11
} else if(str == "Q"){
  b = 12
} else if(str == "K"){
  b = 13
} else {
  b = Integer.parseInt(str)
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
String str = System.console().readLine()
if(str == "J"){
  c = 11
} else if(str == "Q"){
  c = 12
} else if(str == "K"){
  c = 13
} else {
  c = Integer.parseInt(str)
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
String str = System.console().readLine()
if(str == "J"){
  d = 11
} else if(str == "Q"){
  d = 12
} else if(str == "K"){
  d = 13
} else {
  d = Integer.parseInt(str)
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
String str = System.console().readLine()
if(str == "J"){
  e = 11
} else if(str == "Q"){
  e = 12
} else if(str == "K"){
  e = 13
} else {
  e = Integer.parseInt(str)
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

if(card1 == card2 == card3 == card4 == card5){
println "You have a flush!"
}