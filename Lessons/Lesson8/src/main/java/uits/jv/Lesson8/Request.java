package uits.jv.Lesson8;

/**
 * Created by Nia on 20.11.2015.
 */
class Request {

    private Query q;

    private int paramCnt = 0;

    class Query {
        public Query(String[] S) {
            paramCnt = S.length;
        }
        }



    public Query getQuery() {

        return this.q;

    }
}