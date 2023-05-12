package com.lakhan.payload.response;

public class ApiResponse {
	
	    private boolean success;
	    private String message;
	    
	    
	    
		public ApiResponse() {
			
			// TODO Auto-generated constructor stub
		}
		public ApiResponse(boolean success, String message) {
			super();
			this.success = success;
			this.message = message;
		}
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
	    
	    
	    

}
