PImage mustache;
PImage friend;
void setup(){
  friend=loadImage("Friend.jpg");
  size(1000,563);
  friend.resize(1000,563);
  mustache=loadImage("moustache.png");
  }
void draw(){
  background(friend);
  image(mustache, mouseX,mouseY);
}
