void setup(){
  size (1000,1000);
}
void draw(){
  if(mousePressed){
  fill(random(255),random(256),random(236));
  }
  else{
    fill(224,255,255);
  }
    background(300,0,0);
    if(mousePressed){
      fill(random(240),random(259),random(230));
    }
    else{
      fill(32,285,40);
    }
  rect(mouseX,mouseY,200,200);
}
