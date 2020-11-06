  public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        int str_len = str.length();
        for(int i=0;i<str_len;i++)
        {
            char chr = str.charAt(i);
            if(chr >= 'A' && chr <= 'Z') chr += 32;
            sb.append(chr);
        }
        return sb.toString();
    }
