package customer.book_plugin.handlers;

import cds.gen.catalogservice.Books;
import cds.gen.catalogservice.Books_;
import cds.gen.catalogservice.CatalogService_;
import com.sap.cds.CdsDataProcessor;
import com.sap.cds.services.cds.CdsReadEventContext;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.ServiceName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ServiceName(CatalogService_.CDS_NAME)
public class EmojiHandler implements EventHandler {

    @After(event = CqnService.EVENT_READ, entity = Books_.CDS_NAME)
    public void decorateEmojiToBooks(List<Books> books) {
        for(Books book : books) {
            book.setTitle(book.getTitle() + "😀");
        }
    }
}
