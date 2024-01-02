int gcd(int a, int b)
  {

  if(a%b==0)
  {

    return b;
  }
  gcd(b,a%b);
  }
