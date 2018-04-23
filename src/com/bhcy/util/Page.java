package com.bhcy.util;

/**
 * 存放分页信息
 */
public class Page {
	//开始位置
   int start=0;
   //每页的个数
   int pageSize = 5;
   // 最后一页的位置
   int last = 0;
   //总数
   int totalCount = 0;
   
   public int getStart() {
       return start;
   }
   public void setStart(int start) {
       this.start = start;
   }
   public int getLast() {
       return last;
   }
   public void setLast(int last) {
       this.last = last;
   }
   
    public int getPageSize() {
    	return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	/**
     * 通过总数total和每页的个数计算出最后一页的位置
     * @param total
     */
   public void caculateLast(int total) {
       // 假设总数是50，是能够被5整除的，那么最后一页的开始就是45
       if (0 == total % pageSize)
           last = total - pageSize;
       // 假设总数是51，不能够被5整除的，那么最后一页的开始就是50
       else
           last = total - total % pageSize;      
   }
	@Override
	public String toString() {
		return "Page [start=" + start + ", pageSize=" + pageSize + ", last="
				+ last + ", totalCount=" + totalCount + "]";
	}

}