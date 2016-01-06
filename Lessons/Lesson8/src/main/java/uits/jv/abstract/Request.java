package uits.jv.Abstract;

/**
 * Created by Nia on 20.11.2015.
 */
class Request {

    private Query q;


  static class Query {
        public Query(String[] S) {

        }
    }

    public Query getQuery() {

        return this.q;

    }
}