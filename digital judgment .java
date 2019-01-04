/**
                 * 判断数字是否有运算符
                 * 是 不做任何操作
                 * 否 进行下一步
                 *
                 * 判断数字是否是 0
                 * 是 不做任何操作
                 * 否 进行除百
                 *
                 * 将字符串转换成double类型，进行运算后，再转换成String型
                 */
                if (existedText.equals("error")){

                } else {

                    getCondition();

                    if (startWithOperator || startWithSubtract || noStartWithOperator) {

                    } else {
                        if (existedText.equals("0")) {
                            return;
                        } else {
                            double temp = Double.parseDouble(existedText);
                            temp = temp / 100;
                            existedText = String.valueOf(temp);
                        }
                    }
                }
                break;
            case R.id.delete_btn:
