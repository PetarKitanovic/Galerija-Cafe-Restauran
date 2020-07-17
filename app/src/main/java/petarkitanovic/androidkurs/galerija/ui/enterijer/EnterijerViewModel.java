package petarkitanovic.androidkurs.galerija.ui.enterijer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EnterijerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EnterijerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ENTERIJER");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
