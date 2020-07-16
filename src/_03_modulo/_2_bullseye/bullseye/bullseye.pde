
void setup() {
 size (500,500);
  // set the size of your sketch
  
}

void draw() {
  int x = 200;
  int y = 200;
  for (int i = 0; i < 8; i++) {
    if (i % 2 == 0) {
      fill(#FF0808);
    }
    else {
      fill(#030303);
    }
    ellipse(250,250, x, y);
    x = x - 25;
    y = y - 25;
  }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
