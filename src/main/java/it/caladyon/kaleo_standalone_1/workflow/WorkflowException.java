/**
 *
 */
package it.caladyon.kaleo_standalone_1.workflow;

/**
 * @author IG08197
 *
 */
public class WorkflowException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	public WorkflowException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public WorkflowException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public WorkflowException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public WorkflowException(Throwable cause) {
		super(cause);
	}

}
