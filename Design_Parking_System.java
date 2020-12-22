class ParkingSystem {

    HashMap<Integer, Integer> map;
    
    public ParkingSystem(int big, int medium, int small) {
        
        map = new HashMap<>();
        map.put(1, big);
        map.put(2, medium);
        map.put(3, small);
    }
    
    public boolean addCar(int carType) {
        
        if(map.get(carType) > 0) {
            int newValue = map.get(carType) - 1;
            map.put(carType, newValue);
            return true;
        } else
            return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
