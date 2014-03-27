package com.jcm.mongo.client;


/**
 * 
 * @author zhaotengfei
 *
 */
public class MdbHandler{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  /**
   * 
   */
  private String mdbUri;
  
  private String host;
  
  private Integer port;
  
  /**
   * 
   */
  public MdbHandler() {
  }

  /**
   * 
   */
  public MdbHandler(String mdbUri) {
    this.mdbUri = mdbUri;
    parseMdbUri(this.mdbUri);
  }

  /**
   * @param mdbUri
   */
  private void parseMdbUri(String mdbUri) {
    if (null != mdbUri) {
      String[] ms = mdbUri.split(":");
      this.setHost(ms[0]);
      if (ms.length > 0) {
        try {
          this.setPort(Integer.parseInt(ms[1]));
        } catch (Exception e) {
          this.setPort(27017);
        }
      } else {
        this.setPort(27017);
      }
    }
  }

  /**
   * Get the <code>mdbUri</code> value.
   * 
   * @return the <code>mdbUri</code> value of the <code>String</code>.
   */
  public String getMdbUri() {
    return mdbUri;
  }

  /**
   * Set the <code>mdbUri</code> value.
   * 
   * @param mdbUri
   *          the mdbUri to set.
   */
  public void setMdbUri(String mdbUri) {
    parseMdbUri(mdbUri);
    this.mdbUri = mdbUri;
  }

  /**
   * @return the host
   */
  public String getHost() {
    return host;
  }

  /**
   * @param host the host to set
   */
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * @return the port
   */
  public Integer getPort() {
    return port;
  }

  /**
   * @param port the port to set
   */
  public void setPort(Integer port) {
    this.port = port;
  }

  
  
}
