import java.util.Iterator;

public class PriorityQueue<SmallestItems> implements Comparable<PriorityQueue>{
    private Integer SmallestItems;
    public PriorityQueue(Integer S){
        this.SmallestItems = S;
    }
    public Integer getSmallestItems(){
        return SmallestItems;
    }

    @Override
    public int compareTo(PriorityQueue o) {
        if (this.SmallestItems < o.getSmallestItems())
        return 1;
        if (this.SmallestItems > o.getSmallestItems())
        return -1;
        return 0;
    }

    PriorityQueue<SmallestItems> smallestItems = CreateInitPriorityQueueSmallestItems();
    Iterator<SmallestItems> itrSmallest = smallestItems.iterator();
     (itrSmallest. )




    public PriorityQueue<SmallestItems> CreateInitPriorityQueueSmallestItems(){
        java.util.PriorityQueue<SmallestItems> SmallestPriority = new java.util.PriorityQueue<SmallestItems>();
        SmallestPriority.add(new smallestItems(24));
        return SmallestPriority;
    }
}
