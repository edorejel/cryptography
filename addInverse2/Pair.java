package cryptography.addInverse2;

public class Pair <T, U> {

	private T p1;
	private U p2;
	Pair(T d1, U d2){
		this.p1 = d1;
		this.p2 = d2;
	}
	void setValue(T a, U b){
		this.p1 =  a;
		this.p2 = b;
	}
	
	@Override
    public boolean equals(Object object) {
        if(!(object instanceof Pair)) return false;
        Pair<T, U> newData = (Pair<T, U>) object;
        return p1.equals(newData.p1) && p2.equals(newData.p2);
    }

    @Override
    public int hashCode() {
        int result = p1 != null ? p1.hashCode() : 0;
        result = 31 * result + (p2 != null ? p2.hashCode() : 0);
        return result;
    }
    T getValue1(){
		return p1;
	}
	U getValue2(){
		return p2;
	}

    public String toString() {
        return "(" + p1.toString() + ", " + p2.toString() + ")";
    }
}
	
	

//	String getPair(){
//		return "(" + p1 +  ", " + p2 + ")";
//	}
	
	



/*
 * OUTPUT Test #1
 * Enter 1 modulus value to find the additive inverse
10
(0, 0)
(1, 9)
(2, 8)
(3, 7)
(4, 6)
(5, 5)
(6, 4)
(7, 3)
(8, 2)
(9, 1)

 * 
 * 
 * 
 * OUTPUT Test #2
 * Enter 1 modulus value to find the additive inverse
20
(0, 0)
(1, 19)
(2, 18)
(3, 17)
(4, 16)
(5, 15)
(6, 14)
(7, 13)
(8, 12)
(9, 11)
(10, 10)
(11, 9)
(12, 8)
(13, 7)
(14, 6)
(15, 5)
(16, 4)
(17, 3)
(18, 2)
(19, 1)

 * 
 * 
 * 
 * */
 