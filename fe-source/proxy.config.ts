const BACKEND_URL = 'backend';
const BACKEND_PORT = '8080';

const PROXY_CONFIG = {
'/api/*': {
target: `http://${BACKEND_URL}:${BACKEND_PORT}`,
secure: true,
changeOrigin: true,
logLevel: 'debug'   
}
};

module.exports = PROXY_CONFIG;
