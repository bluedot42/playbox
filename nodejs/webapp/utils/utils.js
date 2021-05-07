//utility function to handler errors
const awaitHandlerFactory = (middleware) => {
    return async (req, res, next) => {
        try {
        await middleware(req, res, next)
        } catch (err) {
        next(err)
        }
    }
}

module.exports = {
    awaitHandlerFactory
}