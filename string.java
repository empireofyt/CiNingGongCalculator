/**
                 * 字符串长度大于 0 时才能截取字符串
                 * 如果长度为 1，则直接把字符串设置为 0
                 */
                if (existedText.equals("error")){
                    existedText = "0";
                } else if (existedText.length() > 0){
                    if (existedText.length() == 1) {
                        existedText = "0";
                    } else {
                        existedText = existedText.substring(0,existedText.length()-1);
                    }
                }
                break;
            case R.id.ac_btn:
                existedText = "0";
                break;
        }
         /**
         * 设置显示
         */
        mResultText.setText(existedText);
   
