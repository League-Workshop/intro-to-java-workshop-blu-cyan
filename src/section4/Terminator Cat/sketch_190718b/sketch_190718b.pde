int x= 200;
int y= 224;
int acceleration= 5;
int width=500;
PImage catPic;
void setup(){
size(500,500);
catPic= loadImage("cat.jpg");
catPic.resize(500,500);
background(catPic);
}
void draw(){
if(mousePressed){
  println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
noStroke();
ellipse(x,y,45,90);
ellipse(x+82,y-12,45,90);
fill(#48A3A5);
keyPressed();
if(keyPressed){
 y+=2*acceleration;
x+=2*acceleration;}
if(x>width){
  x=200;
  y=224;
  background(catPic);
}
}

void keyPressed() {

                 x++;

y++;

}
