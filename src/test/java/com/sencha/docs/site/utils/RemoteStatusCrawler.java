package com.sencha.docs.site.utils;

import com.sencha.docs.site.LinksTestInt;

import edu.uci.ics.crawler4j.url.WebURL;

public class RemoteStatusCrawler extends AbstractStatusHandlerCrawler {
  @Override
  public boolean shouldVisit(WebURL url) {
    return super.shouldVisit(url) && url.getParentUrl().toLowerCase().startsWith(LinksTestInt.REMOTE_SITE);
  }
}
