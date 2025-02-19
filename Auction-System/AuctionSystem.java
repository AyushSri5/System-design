public class AuctionSystem {
    private AuctionSystem auctionSystem;


    private AuctionSystem(){

    }

    public AuctionSystem getInstance(){
        if(auctionSystem == null){
            synchronized (AuctionSystem.class){
                if(auctionSystem==null){
                    auctionSystem = new AuctionSystem();
                    return auctionSystem;
                }
            }
        }
        return auctionSystem;
    }
}
