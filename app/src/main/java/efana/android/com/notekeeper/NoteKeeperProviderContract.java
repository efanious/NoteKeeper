package efana.android.com.notekeeper;

import android.net.Uri;

public final class NoteKeeperProviderContract {
    private NoteKeeperProviderContract() {}
    public static final String AUTHORITY = "efana.android.com.notekeeper.provider";
    public static final Uri AUTHORITY_URI = Uri.parse("content://" + AUTHORITY);

    public static final class Courses {
        public static final String PATH = "courses";
        //content://efana.android.com.notekeeper.provider/courses
        public static final Uri CONTENT_URI = Uri.withAppendedPath(AUTHORITY_URI, PATH);
    }

    public static final class Notes {
        public static final String PATH = "notes";
        //content://efana.android.com.notekeeper.provider/courses
        public static final Uri CONTENT_URI = Uri.withAppendedPath(AUTHORITY_URI, PATH);
    }
}
