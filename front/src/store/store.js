import Vuex from 'vuex';
import Vue from 'vue';
import featmgtService from '../service/featuremanagement';

Vue.use(Vuex);

const state = {
  features: [],
};

const actions = {
  addFeature({ commit }, feature) {
    featmgtService.addFeature(feature).then(
      (data) => {
        const newfeat = data;
        newfeat.new = true;
        commit('NEW_FEATURE', feature);
      },
    ).catch();
  },
  fillAllFeatures({ commit }) {
    featmgtService.getAllFeatures().then((data) => { commit('FILL_ALL_FEATURE', data); }).catch();
  },
};

const mutations = {
  FILL_ALL_FEATURE(state, features) {
    state.features = features;
  },
  NEW_FEATURE(state, feature) {
    state.features.unshift(feature);
  },
};

const getters = {
  allFeatures(state) {
    return state.features;
  },
};

export default new Vuex.Store({
  state,
  actions,
  mutations,
  getters,
});
