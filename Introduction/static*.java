

static Scanner sc = new Scanner(System.in);

static int B=0;
static int H=0;
static boolean flag;
static{
B=sc.nextInt();
H=sc.nextInt();
if(B<=0 || H<=0){
    System.out.println("java.lang.Exception: Breadth and height must be positive");
    flag =false;
}else{
    flag=true;
}

}
