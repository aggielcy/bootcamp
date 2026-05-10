public class BusinessException extends RuntimeException { //! together with sysError.java

  private int code;

  private BusinessException(int code, String message) {
    super(message);    
    this.code = code;
  }

  public static BusinessException of(SysError sysError){
    return new BusinessException(sysError.getCode(), sysError.getMessage());
  }

  public int getCode(){
    return this.code;
  }
}



