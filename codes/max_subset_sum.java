public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    int prevsum=0;
	    int cursum =0;
	    int maxsum =0;
	    int si=0;
	    int ei=0;
	    int maxprev=0;
	    int maxsi=0;
	    int maxei=0;
	    int maxlen=-1;
	    int count=0;
	    int i1=0;
	    while(a.get(i1) < 0)
	    {
	    	count++;
	    	i1++;
	    	if(i1 == a.size()) break;
	    }
	    if( count == a.size())
	    {
	        return new ArrayList<Integer>();
	    }
	    
	    si=count;
	    maxsi=count;
	    maxei=count;
	    ei=count;
	    for(int i=count;i<a.size();i++)
	    {
	    	
	        cursum += a.get(i);
	        
	        if(cursum < prevsum)
	        {
	            
	            if(maxprev <= maxsum)
	            {
	            	
	            	
	                if((ei-si) > maxlen)
	                {
	                    
    	                maxprev = maxsum;
    	                maxsi=si;
    	                maxei=ei;
    	                maxlen=ei-si;
    	                
	                }
	            }
	            cursum = 0;
	            prevsum=0;
	            si=i+1;
	        }
	        else
	        {
	            prevsum = cursum;
	            ei = i;
	            
	            if(cursum > maxsum)
	            {
	            	
	                maxsum = cursum;    
	            }
	        }
	        
	    }
	    if(maxprev <= maxsum)
        {
            if((ei-si) > maxlen)
            {
                maxprev=maxsum;
                maxsi=si;
                maxei=ei;
                maxlen=(ei-si);
            }
        }
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        int j=0;
        for(int i=maxsi;i<=maxei;i++)
        {
            al.add(a.get(i));
            j++;
        }
        return al;
	}
