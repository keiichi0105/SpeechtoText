package speechtoText;

import java.io.File;
import java.io.FileNotFoundException;

import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechRecognitionResults;

public class SpeechtoText_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeechToText service = new SpeechToText();

	    service.setUsernameAndPassword("cfc7a773-d208-4623-91bf-8969e467b595", "fkFb8J65nldc");



	    File audio = new File("audio/sample1.wav");

	    RecognizeOptions options = null;
		try {
			options = new RecognizeOptions.Builder()
					.model("ja-JP_BroadbandModel")
			    .audio(audio)
			    .contentType(RecognizeOptions.ContentType.AUDIO_WAV)
			    .build();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    SpeechRecognitionResults transcript = service.recognize(options).execute();



	    System.out.println(transcript);
	}

}
