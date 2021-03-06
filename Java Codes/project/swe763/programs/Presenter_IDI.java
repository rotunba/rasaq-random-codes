package project.swe763.programs;

/**
 * @author Rasaq
 * @OVerview: This class implements the interface dependency injection
 */

public class Presenter_IDI implements IPresenter {

	private IView _view;
	private IModel _model;
	private IService _service;

	public void setView(IView value) {
		_view = value;
	}

	public void setService(IService value) {
		_service = value;
	}

	public void setModel(IModel model) {
		_model = model;

	}

	public Object createView() {
		_view.displayModel(_model);
		return _view;
	}

	public void save() {
		_service.persist(_model);
	}

}