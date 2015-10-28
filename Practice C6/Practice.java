
//R6.15//
    int s = 0;
    for (int i = 1; i <= 10; i++)
    {
     s = s + i;
    }
    //REWRITE AS WHILE LOOP//    
    int s = 0;
    int i = 1;
    while (i <= 10)
    {
        s = s + i;
        i++;
    }
    
//R6.16//
    int n = in.nextInt();
    double x = 0;
    double s;
    do
    {
     s = 1.0 / (1 + n * n);
     n++;
     x = x + s;
    }
    while (s > 0.01);
    //REWRITE AS WHILE LOOP//
    int n = in.nextInt();
    double x = 0;
    double s = 1.0 / (1 + n * n);
    while (s > 0.01)
    {
        s = 1.0 / (1 + n * n);
        n++;
        x = x + s;
    }
        
