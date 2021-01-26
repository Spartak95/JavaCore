package enums.example;

public enum Apple2{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland;
    enum AppleFate{
        Normal("Նորմալ"), Good("Լավ"), Decay("Փչացած");
        private String fate;
        AppleFate(String fate){
          this.fate = fate;
        }
        public String getFate(){
            return fate;
        }
    }
}

