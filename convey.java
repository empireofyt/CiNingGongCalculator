/**
     * ʹ��java��ȷ���ʽȥ�������.��0
     * @param s ������ַ���
     * @return �޸�֮����ַ���
     */
    public static String subZeroAndDot(String s){
        if(s.indexOf(".") > 0){
            s = s.replaceAll("0+?$", "");//ȥ�������0
            s = s.replaceAll("[.]$", "");//�����һλ��.��ȥ��
        }
        return s;
    }
